
package learn.avinash.batch.configuration;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FlowFirstConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Bean
	public Step myStep() {
		return stepBuilderFactory.get("myStep")
				.tasklet(new Tasklet() {
					@Override
					public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
						System.out.println("myStep was executed");
						return RepeatStatus.FINISHED;
					}
				}).build();
	}
//
//	@Bean
//	public Job flowFirstJob(Flow flow) {
//		return jobBuilderFactory.get("flowFirstJob")
//				.start(flow)
//				.next(myStep())
//				.end()
//				.build();
//	}
}
