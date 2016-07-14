//a final class doesn't have derivedd class
class finalmain
{
	public static void main(String args[])
	{
		Finalfile obj=new Finalfile(25);
		//obj.number=33;				//we can't assign a final value
		for(int i=0;i<4;i++)
		{
			obj.getsome();
			System.out.println(obj);		//object automatically calls the tostring func
		}
	}
}
