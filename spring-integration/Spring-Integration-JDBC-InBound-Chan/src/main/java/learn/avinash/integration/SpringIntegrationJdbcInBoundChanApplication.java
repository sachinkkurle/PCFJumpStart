package learn.avinash.integration;

import java.util.concurrent.ExecutionException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationJdbcInBoundChanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationJdbcInBoundChanApplication.class, args);
	}
}
