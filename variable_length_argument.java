class variable_length_argument
{
	public static void main(String args[])
	{
		System.out.println(average(22,55,77,99,88));
	}
	
	public static int average(int...array)
	{
		int total=0;
		for(int x:array)
		{
			total+=x;
		}
		return(total/array.length);
	}
}
		
