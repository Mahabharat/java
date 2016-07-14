class classHoldObj
{
	private Dog doglist[]=new Dog[5];
	private int i=0;
	
	public void doggy(Dog x)
	{
		if(i<doglist.length)
		{
			doglist[i]=x;
			System.out.println("obj at the index no="+i);
			i++;
		}
	}
}
		
