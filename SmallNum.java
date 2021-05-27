import java.util.Scanner;

public class SmallNum {

	public static void main(String[] args) {
		int i,j,k,min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("renter 3 num");
		i=sc.nextInt();
		j=sc.nextInt();
		k=sc.nextInt();
		
		if(i<j)
		{
			if(i<k)
			{
				min=i;
			}
		}
		
		else
		{
			if(j<k)
			{
				min=j;
			}
			else
				min=k;
		}
		
		System.out.println("Small num is "+min);
	}

}
