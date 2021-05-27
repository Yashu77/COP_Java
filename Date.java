
public class Date {

	private int d;
	private int m;
	private int y;
	
	public void setDate(int dd)
	{
		d=dd;
	}
	
	public void setMonth(int mm)
	{
		m=mm;
	}
	
	public void setYear(int yy)
	{
		y=yy;
	}
	
	public int getDate()
	{
		return d;
	}
	public int getMonth()
	{
		return m;
	}
	public int getYear()
	{
		return y;
	}
	
	void display()
	{
		System.out.println(getDate()+"/"+getMonth()+"/"+getYear());
		
	}
}
