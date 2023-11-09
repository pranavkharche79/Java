package beans;

public class Parent {
	private String name;
	protected String Lastname;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(String name, String lastname) {
		super();
		this.name = name;
		Lastname = lastname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	@Override
	public String toString() {
		return "Parent [name=" + name + ", Lastname=" + Lastname + "]";
	}
	
}
