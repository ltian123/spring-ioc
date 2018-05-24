package ioc04;

public class SomeBean {
	
	private String str;
	
	{
		System.out.println("SomeBean.{} "+str);
	}
	
	public SomeBean() {
		System.out.println("SomeBean.SomeBean()");
	}
	
	protected void finalize() throws Throwable {
		System.out.println("SomeBean.finalize()");
		super.finalize();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	public void a(){
		System.out.println("SomeBean.a() "+str);
	}
	
	public void b(){
		System.out.println("SomeBean.b()");
	}
	
}
