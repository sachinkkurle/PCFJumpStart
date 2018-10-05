package learn.avinash.integration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationMessageTemplateApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationMessageTemplateApplication.class, args);
	}

	@Autowired
	@Qualifier("inputchannel")
	private DirectChannel inputchannel;
	
		
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
				Map<String,Object> map = new HashMap<String, Object>();
		map.put("key", "value");
		
		MessageHeaders headers = new MessageHeaders(map);
		Message<String> message = MessageBuilder.withPayload("Hello World from Builder pattern")
				.setHeader("newHeader", "newHeaderValue").build();
		inputchannel.send(message);
		
		MessagingTemplate template = new MessagingTemplate();
		Message messagereurn = template.sendAndReceive(inputchannel, message);
		System.out.println(messagereurn.getPayload());
	}
}
