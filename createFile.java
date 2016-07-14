import java.util.*;

class createFile
{
	public static void main(String args[])
	{
		final Formatter x;
		
		try
		{
			x=new Formatter("gred.txt");
			System.out.println("You created the file");
		}
		
		catch(Exception e)
		{
			System.out.println("The file is not created");
		}
	}
}
