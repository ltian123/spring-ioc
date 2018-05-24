package ioc16;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {
	private String format="yyyy-MM-dd";
	
	
	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Date date=new SimpleDateFormat(format).parse(text);
			setValue(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
