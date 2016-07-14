abstract public class abstractConcrete				//an abstract class can't have obj, but it can have pointers
{								//an concrete class is a normal class, it can have obj
		 void eat()	
		{						//we can use an abstract class in inheritance and polymorphism
			System.out.println("I like to eat candies");
		}
		
		abstract void food();			//an abstract method need an abstract class, it must hava overrided func, 
							//it have no body
}
