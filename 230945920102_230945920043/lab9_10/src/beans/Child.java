package beans;

public class Child extends Parent{
	private String mname;

	public Child() {
		super();
		
	}
	
	public Child(String name, String lastname,String mname) {
		super(name, lastname);
		this.mname=mname;
	}

	public String getCname() {
		return mname;
	}

	public void setCname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return super.toString()+"Child [mname=" + mname + "]";
	}
	
}
