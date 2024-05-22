package alexdev.democonfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConfigurationApplication implements CommandLineRunner {

	@Autowired
	UserDataSourceConfig userDataSourceConfig;

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigurationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("User firstname = " + userDataSourceConfig.getFirstname());
		System.out.println("User lastname = " + userDataSourceConfig.getLastname());
		System.out.println("User email = " + userDataSourceConfig.getEmail());
		System.out.println("User password = " + userDataSourceConfig.getPassword());
	}

}
