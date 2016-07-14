class Finalfile
{
	public final int number;		//final members can't be modify, i.e. its value is constant
	private int sum=0;			
	
	public Finalfile(int x)
	{
		number=x;
		System.out.println("number is="+number);			
	}
	
	public void getsome()
	{
		sum+=number;
	}
	
	public String toString()
	{
		return String.format("sum=%d\n",sum);
	}
} 
	
	
