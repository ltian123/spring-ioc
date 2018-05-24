package ioc14;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean {
	
	private String year;
	private String month;
	private String day;

	public Object getObject() throws Exception {
		return new SimpleDateFormat("yyyyMMdd").parse(year+month+day);
	}

	public Class getObjectType() {
		return Date.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
