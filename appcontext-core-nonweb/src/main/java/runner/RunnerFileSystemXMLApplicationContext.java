package runner;

import beans.SimpleBean;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RunnerFileSystemXMLApplicationContext {

	public static void main(String[] args) {
		String beanxXmlLocation = RunnerFileSystemXMLApplicationContext.class.getResource("/beanx.xml").toExternalForm();
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(beanxXmlLocation);
		context.getBean("simpleBean", SimpleBean.class).sayHello();
	}

}
