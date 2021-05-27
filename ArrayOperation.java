import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {
		
		int i,add=0,n,min,max;
		float avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of array elements");
		n=sc.nextInt();
		int[] arr=new int [n];
		
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(" "+arr[i]);
		}
		System.out.println("Adition is");
		for(i=0;i<n;i++)
			add=add+arr[i];
		System.out.println(add);
		
		avg=(float)add/n;
		System.out.println("Array average is"+avg);
		
		min=max=arr[0];
		for(i=0;i<n;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
			
		}
		System.out.println("min element is "+min);
		System.out.println("max element is "+max);
	}

}
