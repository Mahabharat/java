import java.util.Random;

class Array_elements_as_frequency
{
	public static void main(String args[])
	{
		Random dice=new Random();
		int freq[]=new int[7];
		
		for(int roll=1;roll<=1000;roll++)
		{
			++freq[1+dice.nextInt(6)];
		}
		
		System.out.println("face\tfrequency");
		for(int face=0;face<freq.length;face++)
		{
			System.out.println(face+"\t"+freq[face]);
		}
	}
}
