import java.util.Scanner;

public class Factorial_Num {

	public static void main(String[] args) {
		int num,fact=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		if(num<0)
		{
			System.out.println("can't calculate power of negative num");
		}
		
		else
		{
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial is "+fact);
		}
	}

}
