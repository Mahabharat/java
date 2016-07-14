class animalListmain
{
	public static void main(String args[])
	{
		animalList obj=new animalList();
		
		Animals fox=new Animals();
		obj.add(fox);
		
		Animals rocky=new Dog();		
		obj.add(rocky);
		
		Animals katla=new Fish();
		obj.add(katla);
			
		Dog bull=new Dog();
		obj.add(bull);				//all are Animals type, since inhherited
		
		Fish row=new Fish();
		obj.add(row);
		
	}
}
		
		
