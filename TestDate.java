import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		Date d=new Date();
		Date d1=new Date();
		
		Scanner sc=new Scanner(System.in);
		int dt,mn,yr;
		System.out.println("Enter Date");
		dt=sc.nextInt();
		System.out.println("Enter Month ");
		mn=sc.nextInt();
		System.out.println("Enter Year");
		yr=sc.nextInt();
		
		d.setDate(dt);
		d.setMonth(mn);
		d.setYear(yr);
		d.display();
		
		d1.setDate(++dt);
		d1.setMonth(mn);
		d1.setYear(yr);
		d1.display();
	}
	

}
