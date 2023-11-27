package runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "beans")
public class Runner  {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}


}
