package ioc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc11/applicationContext.xml");
		
		SomeBean someBean=(SomeBean) ac.getBean("someBean");
		
		System.out.println(someBean.getOtherBean());
		System.out.println(someBean.getOtherBean().getStr());
	}
}
