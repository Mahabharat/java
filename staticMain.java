class staticMain
{
	public static void main(String args[])
	{
		Staticfile obj1=new Staticfile("Partha");
		Staticfile obj2=new Staticfile("Udit");
		Staticfile obj3=new Staticfile("Ritu");
		
		System.out.println(obj1.getName());
		System.out.println("members="+obj1.getMembers());
		
		System.out.println(obj2.getName());
		System.out.println("members="+obj2.getMembers());
		
		System.out.println(obj3.getName());
		System.out.println("members="+obj3.getMembers());
		
		System.out.println("members="+Staticfile.getMembers());
			
	}
}
