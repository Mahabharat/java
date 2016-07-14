import java.io.*;
import java.util.*;

public class fileRead
{
	private Scanner x;
	
	public void fileOpen()
	{
		try{
			x=new Scanner(new File("paul.txt"));
		}
		catch(Exception e)
		{
			System.out.println("file is not available");
		}
	}
	
	public void FileRead()
	{
		while(x.hasNext())
		{
			String a = x.next();
			String b = x.next();
			String c = x.next();
			
			System.out.printf("%s %s %s\n",a,b,c);
		}
	}
	
	public void fileClose()
	{
		x.close();
	}
}		

