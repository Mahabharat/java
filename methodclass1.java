import java.util.Scanner;
class methodclass1
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		methodclass2 input=new methodclass2();
		System.out.println("Enter your name");
		String name=obj.nextLine();
		
		input.disp(name);
	}
}
		
