import java.util.Scanner;

public class FunOverload {
	public static void add(int n,int m)
	{
		int res1;
		res1=n+m;
		System.out.println("O/p of 1st"+res1);
	}
	public static void add(int n,int m,int s)
	{
		System.out.println("o/p of 2nd is "+(n+m+s));
	}
	public static void add(int n,float r)
	{
		float res2;
		res2=n+r;
		System.out.println("o/p of 3rd is "+res2);
	}
	public static void add(float r,int m)
	{
		System.out.println("o/p of 4th if "+(r+m));
	}
	public static void main(String[] args) {
		int a,b,c;
		float p,q;
		System.out.println("Enter numbers to perfrm addition");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		p=sc.nextFloat();
		q=sc.nextFloat();
		 add(a,b);
		 add(a,b,c);
		 add(a,p);
		 add(q,b);

	}

}
