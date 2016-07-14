import java.util.EnumSet;

class Enumeration
{
	public static void main(String args[])
	{
		for(Enset people: Enset.values())
			System.out.printf("%s\t%s\t%d\n",people,people.dispname(),people.dispage());
		
		System.out.println("\n\nEnumSet Range\n");
		for(Enset people: EnumSet.range(Enset.Rahul,Enset.Dhoni))
			System.out.printf("%s\t%s\t%d\n",people,people.dispname(),people.dispage());
	}
}
