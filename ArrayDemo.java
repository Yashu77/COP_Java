import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int i;
		int[]arr=new int[5];
		System.out.println("enetr array elements");
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(i=0;i<5;i++)
		{
			
			System.out.println(arr[i]);
		}
		

	}

}
