class nested_if
{
	public static void main(String args[])
	{
		int age=65;
		if(age<50)
		{
			System.out.println("You are pretty young");
		}
		else
		{
			System.out.println("You are old");
			if(age>75)
			{
				System.out.println("omg, you are so old");
			
			}
			else
			{
				System.out.println("don't worry, you are not so old");
			}
		}
	}
}
