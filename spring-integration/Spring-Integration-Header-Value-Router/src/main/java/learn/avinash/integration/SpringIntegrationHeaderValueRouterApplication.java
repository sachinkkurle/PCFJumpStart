package learn.avinash.integration;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationHeaderValueRouterApplication implements ApplicationRunner {

	@Autowired
	private PrinterGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationHeaderValueRouterApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws InterruptedException, ExecutionException {

		for (int x = 0; x < 10; x++) {
			Message<?> message = MessageBuilder.withPayload(x).setHeader("routeHeader", "string").build();
			this.gateway.print(message);
		}

	}
}
