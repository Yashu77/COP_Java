import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		int n,i,res=0;
		System.out.println("Enter end num in series");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			res=res+i;
		}
		
		System.out.println("Sum of series is "+res);

}

}