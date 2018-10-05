package learn.avinash.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration-context.xml")
public class SpringIntegrationHttpOutBoundGateWayApplication implements ApplicationRunner {

	@Autowired
	private SimpleGateway gateway;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationHttpOutBoundGateWayApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.gateway.execute("Anything");
	}

}
