import java.util.Scanner;
class average
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int total=0;
		int average;
		int marks;
		int count=0;
		while(count<10);
		{
			marks=input.nextInt();
			total+=marks;
			count++;
		}
		average=total/count;
		System.out.println("average is "+average);
	}
}

