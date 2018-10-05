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
public class SpringIntegrationProcessingGatewayApplication implements ApplicationRunner {

	@Autowired
	private EnhancedPrinterGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationProcessingGatewayApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws InterruptedException, ExecutionException {
		Person[] payloads = { new Person("Avinah", "Tiwari"), new Person("Tiwari", "Avinash") };
		for (int x = 0; x < payloads.length; x++) {
			String returnMessage = this.gateway.uppercase(payloads[x]);
			System.out.println(returnMessage);
		}
	}

}
