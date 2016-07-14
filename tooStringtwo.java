class tooStringtwo
{
	private int day;
	private int month;
	private int year;
	
	public tooStringtwo(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
		System.out.printf("%s\n",this);		//this refers to toString method
		
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d",day, month, year);
	}
}
	
