import java.util.Scanner;

public class SumOdd_Even {

	public static void main(String[] args) {
		
		int num,even=0,odd=0,i;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("Sum of even num is "+even);
		System.out.println("Sum of odd num is "+odd);
	}

}
