import java.util.Scanner;

public class Grossalary {

	public static void main(String[] args) {
		float basic ,gross,hra=0,da=0;
		System.out.println("enter basic salary");
		Scanner sc=new Scanner(System.in);
		basic=sc.nextFloat();
		
		if(basic<=10000)
		{
			hra=(basic*20)/100;
			da=(basic*80)/100;
		}
		if(basic<=20000)
		{
			hra=(basic*25)/100;
			da=(basic*90)/100;
		}
		if(basic>10000)
		{
			hra=(basic*30)/100;
			da=(basic*95)/100;
		}
		
		gross=basic+hra+da;
		System.out.println("Gross salary is"+gross);
		
	}

}
