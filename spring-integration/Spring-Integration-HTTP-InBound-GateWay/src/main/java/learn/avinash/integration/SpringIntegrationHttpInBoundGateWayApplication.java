package learn.avinash.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ImportResource("integration-context.xml")public class SpringIntegrationHttpInBoundGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationHttpInBoundGateWayApplication.class, args);
	}
}
