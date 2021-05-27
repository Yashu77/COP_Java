import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int num,i,flag=0;
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(num==1)
			System.out.println("1 is not prime not composit");
		
		else
		{
			if(flag==0)
				System.out.println(num+" is prime");
			
			else
				System.out.println(num+" Not prime");
		}
		

}
}