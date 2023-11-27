package runner;

import beans.SimpleBean;
import configuration.ConfigurationManuallyDefined;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerAnnotationConfigWithStaticConfiguration {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
						ConfigurationManuallyDefined.class);
		context.getBean("simpleBean", SimpleBean.class).sayHello();
	}

}
