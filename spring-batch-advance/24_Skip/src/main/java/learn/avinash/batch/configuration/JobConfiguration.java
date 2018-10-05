
package learn.avinash.batch.configuration;

import java.util.ArrayList;
import java.util.List;

import learn.avinash.batch.components.CustomRetryableException;
import learn.avinash.batch.components.SkipItemProcessor;
import learn.avinash.batch.components.SkipItemWriter;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
public class JobConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	@StepScope
	public ListItemReader<String> reader() {

		List<String> items = new ArrayList<>();

		for(int i = 0; i < 100; i++) {
			items.add(String.valueOf(i));
		}

		return new ListItemReader<>(items);
	}

	@Bean
	@StepScope
	public SkipItemProcessor processor(@Value("#{jobParameters['skip']}")String skip) {
		SkipItemProcessor processor = new SkipItemProcessor();

		processor.setSkip(StringUtils.hasText(skip) && skip.equalsIgnoreCase("processor"));

		return processor;
	}

	@Bean
	@StepScope
	public SkipItemWriter writer(@Value("#{jobParameters['skip']}")String skip) {
		SkipItemWriter writer = new SkipItemWriter();

		writer.setSkip(StringUtils.hasText(skip) && skip.equalsIgnoreCase("writer"));

		return writer;
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step")
				.<String, String>chunk(10)
				.reader(reader())
				.processor(processor(null))
				.writer(writer(null))
				.faultTolerant()
				.skip(CustomRetryableException.class)
				.skipLimit(15)
				.build();
	}

	@Bean
	public Job job() {
		return jobBuilderFactory.get("job")
				.start(step1())
				.build();
	}
}
