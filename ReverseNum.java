import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int num,rev=0,x;
		System.out.println("Enter number to reverse");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		while(num!=0)
		{
			x=num%10;
			rev=rev*10+x;
			num=num/10;
		}
		System.out.println("Reverse of num is "+rev);

	}

}
