import java.util.*;

public class AddNum {

	public static void main(String[] args) {
		int a,b,result;
		char c,d,res;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Num");
		a=sc.nextInt();
		System.out.println("Enter second Num");
		b=sc.nextInt();
		
		result=a+b;
		System.out.println("Addition is "+result);
		
		System.out.println("Enter character");
		c=sc.next().charAt(0);
		System.out.println("Enter another character");
		d=sc.next().charAt(0);
		
		System.out.println("character after concatenation");
		System.out.println(c+d);
		
	}

}
