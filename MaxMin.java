import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr=new int [5];
		int i,min,max;
		System.out.println("Enter array elements");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.println(""+arr[i]);
		}
		min=max=arr[0];
		for(i=0;i<5;i++)
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
