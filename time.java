public class time
{
	private int hours;
	private int minutes;
	private int seconds;
	
	public void getdata(int h, int m, int s)
	{
		hours=((h>=0&&h<24)?h:0);
		minutes=((m>=0&&h<60)?m:0);
		seconds=((s>=0&&s<60)?s:0);
	}
	
	public String toMilitary()		//24 hours(toMilitary)
	{
		return String.format("%02d:%02d:%02d",hours,minutes,seconds);
	}
	
	public void totring()			//12 hours(toString)
	{
		System.out.printf("%02d:%02d:%02d %s\n",((hours==0||hours==12)?12:hours%12),minutes,seconds, ((hours<12)?"AM":"PM"));
	}
	
	 
}
