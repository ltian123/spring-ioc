package ioc16;

import java.beans.PropertyEditorSupport;

public class AddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s=text.split("-");
		Address addr=new Address();
		addr.setProvince(s[0]);
		addr.setCity(s[1]);
		setValue(addr);
	}
}
