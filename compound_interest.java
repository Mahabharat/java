class compound_interest
{
	public static void main(String args[])
	{
		double Amount;
		double Principal=10000; 
		double rate=0.01;
		for(int day=1;day<=10;day++)
		{
			Amount=Principal*Math.pow(1+rate,day);
			System.out.println(day+"            "+Amount);
		}
	}
}
