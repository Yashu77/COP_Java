import java.util.Scanner;

public class SwapFun {
	public static void swap(int a,int b)
	{
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("after swapping\n"+a+"\n"+b);
	}
	public static void main(String[] args) {
		int p,q;
		System.out.println("Enter numbers to swap");
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();
		swap(p,q);
	}
	
}
