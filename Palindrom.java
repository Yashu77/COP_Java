import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int num,rev=0,x,tmp;
		System.out.println("Enter num");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		tmp=num;
		while(num!=0)
		{
			x=num%10;
			rev=rev*10+x;
			num=num/10;
		}
		
		if(tmp==rev)
		{	
			System.out.println(rev+" Number is palindrom");
		}
		
		else
		{
			System.out.println(rev+" Number is not pallindrom");
		}
	}	

}
