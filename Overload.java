class Overload
{
	private int hours;
	private int minutes;
	private int seconds;
	
	public Overload()
	{
		this(0,0,0);		//refers to constructors with 3 args
	}
	public Overload(int h)
	{
		this(h,0,0);
	}
	public Overload(int h, int m)
	{
		this(h,m,0);
	}
	public Overload(int h, int m, int s)
	{
		setData(h,m,s);
	}
	public void setData(int h, int m, int s)
	{
		hours=((h>=0&&h<24)?h:0);
		minutes=((m>=0&&m<60)?m:0);
		seconds=((s>=0&&s<60)?s:0);
		//display();
	}
	public void display()
	{
		System.out.printf("%02d:%02d:%02d\n",hours,minutes, seconds);
	}
}		
