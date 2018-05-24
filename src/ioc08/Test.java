package ioc08;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("ioc08/applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
//		ApplicationContext ac = new ClassPathXmlApplicationContext(
//				"ioc08/applicationContext.xml");
		
		System.out.println("-----------------------------------------");
		
		SomeBean someBean=(SomeBean) bf.getBean("someBean");
		
		
		
	}
}
