class passing_array
{
	public static void main(String args[])
	{
		int array[]={5, 8, 9, 4 , 0};
		change(array);
		
		for(int y: array)
		{
			System.out.println(y);
		}
	}
	
	public static void change(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			x[i]+=5;
		}
	}
}
