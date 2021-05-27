import java.util.Scanner;

public class StudInfo {

	public static void main(String[] args) {
		int roll,m;
		String name;
		float per, total;
		System.out.println("Enter Roll number");
		Scanner sc=new Scanner(System.in);
		roll=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter markes of 5 subject");
		float m1=sc.nextFloat();
		float m2=sc.nextFloat();
		float m3=sc.nextFloat();
		float m4=sc.nextFloat();
		float m5=sc.nextFloat();
		
		total=m1+m2+m3+m4+m5;
		per=(total/500)*100;
		System.out.println("total"+total);
		System.out.println("precentage"+per);
		
		if(per>75)
			System.out.println("Grad is A");
		
		else if(74<per&& per>60)
			System.out.println("Grade is B");
			
		else if(per<59)
			System.out.println("Grad is C");
			
		else
			System.out.println("Invalid inputfrom user");
	}

}
