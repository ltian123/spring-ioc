package ioc10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc10/applicationContext.xml");
		
		SomeBean someBean=(SomeBean) ac.getBean("someBean");
		OtherBean otherBean=(OtherBean) ac.getBean("otherBean");
		
		System.out.println(someBean.getSome());
		System.out.println(otherBean.getSome());
		
		System.out.println("======================================");
		
		SomeBean someBean1=(SomeBean) ac.getBean("someBean1");
		SomeBean someBean2=(SomeBean) ac.getBean("someBean2");
		
		System.out.println(someBean1.getSome());
		System.out.println(someBean1.getOther());
		System.out.println(someBean2.getSome());
		System.out.println(someBean2.getOther());
		
		
		
		
		
		
		
	}
}
