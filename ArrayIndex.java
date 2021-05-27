import java.util.Scanner;

public class TestHello {
	public static void main(String[] args)
	{
		int size,i,k;
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter array element");
		
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array is \n");
		for(i=0;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\n Enter num to search");
		int num=sc.nextInt();
		int flag=0;
		for(i=0;i<size;i++)
		{
			if(num==a[i])
			{	
				flag=1;
			System.out.println("num present");
			 System.out.println(i);
			 break;
			}
			
		}
		if(flag==0)
		{	
		
		System.out.println("num not prsnt");

		}
		
	}
}