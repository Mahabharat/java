import java.util.Scanner;
class avg
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int total=0;
		float average;
		int marks;
		int counter=0;
		while(counter<10)
		{
			marks=input.nextInt();
			total+=marks;
			counter++;
		}
		average=(float)total/10;
		System.out.println("average is "+average);
	}
}

