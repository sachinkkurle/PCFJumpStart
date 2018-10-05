package learn.avinash.integration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationMessageApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationMessageApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("key", "value");
		
		MessageHeaders headers = new MessageHeaders(map);
		Message<String> message = MessageBuilder.withPayload("Hello World from Builder pattern")
				.setHeader("newHeader", "newHeaderValue").build();
		PrintService printServie = new PrintService();
		printServie.print(message);
		
}
}
