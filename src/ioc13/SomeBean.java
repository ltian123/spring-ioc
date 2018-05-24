package ioc13;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SomeBean implements ApplicationContextAware {
	
	private ApplicationContext ac;
	
	public void doSome(){
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//			"ioc13/applicationContext.xml");
		System.out.println("doSome ac:"+ac);
	}

	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		this.ac=ac;
	}
}
