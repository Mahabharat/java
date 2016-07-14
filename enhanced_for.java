class enhanced_for
{
	public static void main(String args[])
	{
		int arr[]={22,55,33,77,55};
		int total=0;
		for(int x: arr)
		{
			total+=x;
			System.out.println(x);
		}
		System.out.println("total is:"+total);
	}
}
