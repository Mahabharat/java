class polymorphism
{
	public static void main(String args[])
	{
	     /* polysuperclass obj1=new polyinheritone();	//in polymorphism we can create object using superclass
		polysuperclass obj2=new polyinherittwo();
		
		obj1.eat();
		obj2.eat();*/
		
		
		//or polymorphic array
		
		
		/*polysuperclass obj[]=new polysuperclass[2];
		obj[0]=new polyinheritone();
		obj[1]=new polyinherittwo();
		
		for(int i=0;i<2;i++)
		{
			obj[i].eat();
		}
		*/
		//or enhanced for
		
		polysuperclass obj[]=new polysuperclass[2];
		
		polyinheritone d=new polyinheritone();
		polyinherittwo f=new polyinherittwo();
		
		obj[0]=d;
		obj[1]=f;
		
		for(polysuperclass x: obj)
		{
			x.eat();
		}
	}
}
		
