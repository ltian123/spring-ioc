package ioc16;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.awt.CustomCursor;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc16/applicationContext.xml");
		
		Person person=(Person) ac.getBean("person");
		System.out.println(person.getAddr().getProvince()+" "+person.getAddr().getCity());
		System.out.println(person.getBirthday());
		System.out.println(Arrays.toString(person.getHobbies()));
		
		
		
//		new CustomDateEditor(
//				new SimpleDateFormat(
//						"yyyy年MM月dd日"
//				),
//				true
//		);
		
	}
}
