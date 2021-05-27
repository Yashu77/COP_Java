import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int ch;
		int p,pc,n=0,b,c;
		int i=0,j=0,l=0,m=0,nt;
		int total=0;
		System.out.println("1.pen");
		System.out.println("2.pencile");
		System.out.println("3.NoteBook");
		System.out.println("4.Bottle");
		System.out.println("5.ColoBox");
		
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		while(flag!=true)
		{
		System.out.println("Enter Ur choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
				System.out.println("enter no. of pen");
				p=sc.nextInt();
				i=p*10;
				System.out.println("total of pen is "+i);
				break;
		case 2:
				System.out.println("enter no. of pencile");
				pc=sc.nextInt();
				j=pc*5;
				System.out.println("total of pencile is "+j);
				break;
		case 3:
				System.out.println("enter no. of Notebook");
				nt=sc.nextInt();
				l=nt*20;
				System.out.println("total of notebook is "+l);
				break;
		case 4:
				System.out.println("enter no. of bottale");
				b=sc.nextInt();
				m=b*30;
				System.out.println("total of bottle is "+m);
				break;
		case 5:
				System.out.println("enter no. of colorbox");
				c=sc.nextInt();
				n=c*50;
				System.out.println("total of colobox is "+n);
				break;
				
		case 6:	
				total=i+j+l+m+n;
				System.out.println("total is "+total);	
				break;
		case 7:
				flag=true;
				System.exit(0);
				break; 
		default:
				System.out.println("invalid choice");
				break;
		}
		
		}
	
		
	}
	
}
