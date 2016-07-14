class These
{
	//1
	//private int a;
	
	//2
	private int a=2;
	
	//3
	/*public void getdata(int x)
	{
		a=x;
	}*/
	
	//4
	/*public void getdata(int a)		//when arg and var are same, then var get default value, not the newer one
	{
		a=7;//=a          
	}*/
	
	//5
	public void getdata(int a)
	{
		this.a=a;		////get rid of the above problem
	}
	
	
	
	public void putdata()
	{
		System.out.println("a="+a);
	}	
}
