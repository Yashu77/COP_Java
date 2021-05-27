
public class Customer {

	private String name;
	private	String email;
	private int age;
	
	public Customer()
	{
		name="Riya";
		email="riya@gmail.com";
		age=25;
	}
	
	public void displayCustomer()
	{
		System.out.println("Name "+name);
		System.out.println("email "+email);
		System.out.println("age "+age);
	}
	
	public Customer(String name,String email,int age)
	{
		this.name=name;
		this.email=email;
		this.age=age;
	}
}
