package ioc15;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SomeBeanPropertyPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
//		if("someBean".equals(id)){
//			
//		}
		if(bean instanceof SomeBean){
			SomeBean someBean=(SomeBean) bean;
			someBean.setStr(someBean.getStr().toUpperCase());
		}
		return bean;
//		return "abc";
	}

	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
		return bean;
	}

}
