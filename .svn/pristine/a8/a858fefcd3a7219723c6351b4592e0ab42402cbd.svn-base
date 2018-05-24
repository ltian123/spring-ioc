package ioc14;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.springframework.beans.factory.FactoryBean;

public class SAXParserFactoryBean implements FactoryBean {

	public Object getObject() throws Exception {
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParser parser=factory.newSAXParser();
		return parser;
	}

	public Class getObjectType() {
		return SAXParser.class;
	}

	public boolean isSingleton() {
		return false;
	}

}
