public enum Enset
{
	Sachin("Master", 45),			//all are enum object-constant, they call the constructor
	Rahul("TheWall",43),
	Ganguly("Tiger",44),
	Dhoni("mahi",37),
	Kohli("magic",28);
	
	
	private final String name;
	private final int age;
	
	Enset(String x, int y)
	{
		name=x;
		age=y;
	}
	
	public String dispname()
	{
		return name;
	}
	
	public int dispage()
	{
		return age;
	}
}
