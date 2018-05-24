package ioc09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc09/applicationContext.xml");
		
		SomeBean someBean1=(SomeBean) ac.getBean("someBean");
		
		SomeBean someBean2=(SomeBean) ac.getBean("someBean");
		
		SomeBean someBean3=(SomeBean) ac.getBean("someBean");
		
		SomeBean someBean4=(SomeBean) ac.getBean("someBean");
		
		System.out.println(someBean1);
		
		System.out.println(someBean2);
		
		System.out.println(someBean3);
		
		System.out.println(someBean4);
		
		
		
		
		
		
		
		
		
	}
}
