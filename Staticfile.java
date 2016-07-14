class Staticfile
{
	private String name;
	private static int members=0;
	
	public Staticfile(String x)
	{
		name=x;
		members++;
		System.out.printf("first name is %s and member number is=%d\n",name,members);
	}
	
	public String getName()			//different copies are created for different object
	{
		return name;
	}
	
	public static int getMembers()		//static variables are same for any object, so it can be called by the  class
	{
		return members;
	}
}
	
	
