import java.io.*;
import java.util.*;
import java.lang.*;

class writeInFile
{
	private Formatter x;
	
	public void openFile()
	{
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
	public void writeFile()
	{
		x.format("%s","i love my India");
	}
	
	public void closeFile()
	{
		x.close();
	}
}
