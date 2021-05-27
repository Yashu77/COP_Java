import java.util.Scanner;

public class PowerNum {

	public static void main(String[] args) {
		int base,exp,result=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base Num");
		base=sc.nextInt();
		System.out.println("Enter exponent");
		exp=sc.nextInt();
		
		while(exp!=0)
		{
			result=result*base;
			exp--;
		}
		System.out.println("poswer is "+result);

	}

}
