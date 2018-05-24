package ioc12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
//		Resource resource=new ClassPathResource("ioc12/a.txt");
//		
//		System.out.println(resource.getFilename());
//		System.out.println(resource.getURL());
//		InputStream in=resource.getInputStream();
//		BufferedReader br=new BufferedReader(
//				new InputStreamReader(
//						in,"utf-8"));
//		
//		System.out.println(br.readLine());
//		
//		br.close();
//		
//		System.out.println(resource.exists());
//		
//		File file=resource.getFile();
//		
//		System.out.println(file.length());
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"ioc12/applicationContext.xml");
		
//		Resource resource=ac.getResource("ioc12/a.txt");
		
//		Resource resource=ac.getResource("classpath:ioc12/a.txt");
//		Resource resource=ac.getResource("file:E:/sbngj/spring-ioc/WebRoot/WEB-INF/classes/ioc12/a.txt");
//		
//		System.out.println(resource.exists());
		
		
		SomeBean someBean=(SomeBean) ac.getBean("someBean");
		
		System.out.println(someBean.getResource().getFilename());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
