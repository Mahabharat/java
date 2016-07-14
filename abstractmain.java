class abstractmain
{
	public static void main(String args[])
	{
		//abstractConcrete obj1=new abstractConcrete();		//an abstract class doesn't have obj
		//obj1.eat();
		
		abstractConcrete obj2=new abstractClass();
		obj2.food();					//overrided abstract function
		
		
		abstractClass obj=new abstractClass();
		obj.eat();					//inherited
		obj.digest();					//derived
	}
}
		
