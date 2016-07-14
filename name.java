class name
{
	private String Name;
	private tooStringtwo obj1;	//composition
	
	public name(String x,tooStringtwo y)
	{
		Name=x;
		obj1=y;
	}
	
	public String toString()
	{
		return String.format("My name is %s, my birthDate is %s",Name,obj1 );//obj call toString func automatically
	}	//toString func convert object to string
}		
	
