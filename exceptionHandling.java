import java.util.Scanner;

class exceptionHandling
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int x=1;
		do
		{
			try
			{
			System.out.println("Enter first number");
			int num1=input.nextInt();
	
			System.out.println("Enter Second number");
			int num2=input.nextInt();
		
			int div=num1/num2;			//if num=0, then catch is called, x remains 1
			
			System.out.println(div);
			x=2;
			}
			
			catch(Exception e)
			{
			System.out.println(" It is not possible\n");
			}	
		}
		
		while(x==1);
	}
}		
