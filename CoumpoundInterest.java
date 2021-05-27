import java.util.Scanner;

public class CoumpoundInterest {

	public static void main(String[] args) {
		int amt=0,pcpl,rate,time,ci,i;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter principle");
		pcpl=sc.nextInt();
		System.out.println("enter time in year");
		time=sc.nextInt();
		System.out.println("Rate");
		rate=sc.nextInt();
		
		for(i=1;i<=time;i++)
		{
			amt=pcpl*(1+rate/100);
		}
		
		ci=amt-pcpl;
		System.out.println("amunt is "+amt);
		System.out.println("compound interest is "+ci);
		
		
		

	}

}
