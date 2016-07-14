class animalList
{
	private Animals Jlist[]=new Animals[5];
	private int i=0;
	
	public void add(Animals x)
	{
		if(i<Jlist.length)
		{
			Jlist[i]=x;
			System.out.println("Animal added at index="+i);
			i++;
		}
	}
}
