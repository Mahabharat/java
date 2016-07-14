import java.util.Scanner;
class manymethod
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		manymethod1 obj=new manymethod1();
		System.out.println("Which book have you read?");
		String name=input.nextLine();
		obj.setName(name);
		obj.disp();
	}
}
