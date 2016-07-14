import java.util.Scanner;
class calcul
{
	public static void main(String args[])
	{
		Scanner bucky=new Scanner(System.in);
		double a,b,ans;
		System.out.print("Enter the value of a=");
		a=bucky.nextInt();//5;
		System.out.print("Enter the value of b=");
		b=bucky.nextInt();//6;
		ans=a+b;
		System.out.println("the ans is="+ans);
	}
}
