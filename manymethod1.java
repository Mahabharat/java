public class manymethod1
{
	private String bookName;//instance variable-outside method
	public manymethod1(String name)//construtor-name is as same as class name, no return type,
	{
		bookName=name;//the first letter of the 2nd part of method or field(var) name is 'Capital' 
	}
	public void setName(String name)
	{
		bookName=name;
	}
	public String getName()
	{
		return bookName;
	}
	public void disp()
	{
		System.out.printf("The book I have read is %s\n",getName());//like C
		//System.out.print("pppppp"+"oooooooo");//like python
	}
}
