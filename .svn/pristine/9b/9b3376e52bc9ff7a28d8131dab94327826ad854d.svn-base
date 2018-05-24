package ioc07;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		SomeBeanFactory factory=new SomeBeanFactory();
//		ISomeBean someBean=factory.getSomeBean();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc07/applicationContext.xml");
		
		ISomeBean someBean=(ISomeBean) ac.getBean("someBean");
		
		someBean.doSome();
		
//		Calendar cal=Calendar.getInstance();
//		Date date=cal.getTime();
		Date date=(Date) ac.getBean("date");
		System.out.println(date);
		
		
		
		
		
		
		
		
		
		
	}
}
