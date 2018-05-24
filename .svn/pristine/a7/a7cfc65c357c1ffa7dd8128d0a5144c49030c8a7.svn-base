package ioc14;

import java.util.Date;

import javax.xml.parsers.SAXParser;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
//		SAXParserFactory factory=SAXParserFactory.newInstance();
//		SAXParser parser=factory.newSAXParser();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc14/applicationContext.xml");
		
		SAXParser parser=(SAXParser) ac.getBean("parser");
		
		System.out.println(parser);
		
		/*
		 * <bean id="date" class="xxx.Xxx">
		 * 	<property name="year" value="2016"/>
		 * 	<property name="month" value="11"/>
		 * 	<property name="day" value="16"/>
		 * </bean>
		 */
		Date date=(Date) ac.getBean("date");
		System.out.println(date);
		
		
	}
}
