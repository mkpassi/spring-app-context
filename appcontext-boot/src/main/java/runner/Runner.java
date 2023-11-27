package runner;

import beans.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "beans")
public class Runner implements CommandLineRunner {

	@Autowired
	SimpleBean simpleBean;

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}

	@Override public void run(String... args) throws Exception {
		simpleBean.sayHello();
	}
}
