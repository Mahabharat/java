class multidimentional_array
{
	public static void main(String args[])
	{
		int arr1[][]={{11,22,33},{44,55,66}};
		int arr2[][]={{11,44},{55,77,22},{99}};
		
		System.out.println("This is my first array");
		disp(arr1);
		
		System.out.println("This is my second array");
		disp(arr2);
	}
	
	public static void disp(int x[][])
	{
		for(int row=0;row<x.length;row++)
		{
			for(int column=0;column<x[row].length;column++)
			{
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
	}
}
