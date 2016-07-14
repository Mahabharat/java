import java.io.File;

class file
{
	public static void main(String args[])
	{
		File x=new File("/home/partha/Desktop/java/PPP.txt");
		
		if(x.exists())
			System.out.println(x.getName()+" exists");
		else
			System.out.println(x.getName() +" does not exist");
	}
}
