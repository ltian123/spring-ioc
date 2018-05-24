package ioc03;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc03/applicationContext.xml");
		
		SomeBean someBean=(SomeBean) ac.getBean("someBean");
		
		System.out.println(someBean.getList());
		System.out.println(someBean.getSet());
		System.out.println(someBean.getMap());
		System.out.println(someBean.getProps());
		System.out.println(Arrays.toString(someBean.getArray()));
	}
}
