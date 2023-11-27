package configuration;

import beans.SimpleBean;
import beans.SimpleBean2;
import beans.SimpleBean3;
import org.springframework.context.annotation.Bean;

public class ConfigurationManuallyDefined {

	@Bean(name = "simpleBean")
	public SimpleBean getSimpleBean() {
		return new SimpleBean();
	}

	@Bean
	public SimpleBean2 getSimpleBean2() {
		return new SimpleBean2();
	}

	@Bean
	public SimpleBean3 getSimpleBean3() {
		return new SimpleBean3();
	}


}
