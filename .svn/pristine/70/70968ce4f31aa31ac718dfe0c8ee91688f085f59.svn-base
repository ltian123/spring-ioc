package ioc04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		SomeBean someBean=new SomeBean();
//		
//		someBean=null;
//		
//		System.gc();
//		Runtime.getRuntime().gc();
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc04/applicationContext.xml");
		
		SomeBean someBean=(SomeBean) ac.getBean("someBean");
		
//		someBean.a();
		
//		ac.destroy();
		
		ac.registerShutdownHook();
		
		while(true){
			
		}
	}
}
