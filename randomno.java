import java.util.Random;
class randomno
{
	public static void main(String args[])
	{
		Random dice =new Random();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(1+dice.nextInt(6));//1+(0 to 5)=(1 to 6)
		}
	}
}
