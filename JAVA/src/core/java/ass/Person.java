package core.java.ass;

public class Person {
	
	protected String name;
	protected String address;
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "NAME:"+name+" "+"ADDRESS:"+address;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
