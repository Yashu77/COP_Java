import java.util.Scanner;

public class Swap_Num extends PowerNum {

	public static void main(String[] args) {
		int num1,num2,tmp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		num1=sc.nextInt();
		System.out.println("Enter second num");
		num2=sc.nextInt();
		
		tmp=num1;
		num1=num2;
		num2=tmp;
		System.out.println("After swaping");
		
		System.out.println("first num is "+num1);
		System.out.println("second num "+num2);
		

	}

}
