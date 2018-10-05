package learn.avinash.integration;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationProcessingGatewayHeaderApplication implements ApplicationRunner {

	@Autowired
	private EnhancedPrinterGateway gateway;

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationProcessingGatewayHeaderApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws InterruptedException, ExecutionException {
		Person[] payloads = { new Person("Tiwari", "Avinash"), new Person("Avinash", "Tiwari") };
		for (int x = 0; x < payloads.length; x++) {
			this.gateway.print(payloads[x]);
//			System.out.println(returnMessage);
		}
	}

}
