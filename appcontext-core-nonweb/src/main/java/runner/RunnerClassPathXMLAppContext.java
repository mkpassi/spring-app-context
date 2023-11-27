package runner;

import beans.SimpleBean;
import beans.SimpleBean2;
import beans.SimpleBean3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerClassPathXMLAppContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/beanx.xml");
		context.getBean("simpleBean", SimpleBean.class);
	}

}
