import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer customer1=new Customer();
		customer1.displayCustomer();
		
		System.out.println("-----------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		
	
		Customer customer2 =new Customer(name,email,age);
		customer2.displayCustomer();
	}

}
