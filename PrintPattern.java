import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		int i,j,limit;
		System.out.println("Enter no.of rows to print pattern");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		for(i=0;i<=limit;i++)
		{
			for(j=0;j<=i;j++)
			{ 
				System.out.print("* ");
			}
			
			System.out.println("");
		}

	}

}
