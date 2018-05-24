package ioc06;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		ISomeBean someBean=SomeBeanFactory.getSomeBean();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc06/applicationContext.xml");
		
		ISomeBean someBean=(ISomeBean) ac.getBean("someBean");
		someBean.doSome();
		
		
//		Map env=System.getenv();
		Map env=(Map) ac.getBean("env");
		System.out.println(env);
		
		
//		String javaHome=System.getenv("JAVA_HOME");
		String javaHome=(String) ac.getBean("javaHome");
		System.out.println(javaHome);
		
		
		
		
		
		
		
		
		
	}
}
