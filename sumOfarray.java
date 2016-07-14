class sumOfarray
{
	public static void main(String args[])
	{
		int arr[]={44, 77, 55, 99, 11};
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum is:"+sum);
	}
}
