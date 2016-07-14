class string
{
	public static void main(String args[])
	{
		//1.
		String str="Partha Pritam";
		System.out.println(str);
		//char a=str[0];				//we can't assign like this
		
		//2.
		int c=str.length();
		System.out.println("String length is="+c);
		
		//3.
		String s1=str.toLowerCase();
		System.out.println("lower case="+s1);
		
		//4.
		String s2=str.toUpperCase();
		System.out.println("upper case="+s2);
		
		//5.
		String s3=str+" Paul";
		System.out.println(s3);
		
		//6.
		System.out.println(s3.replace('a','e'));
		
		//7.
		System.out.println(s3.indexOf('P'));
		
		//8.
		String a="Partha";
		String b="PARTHA";
		
		if(a.equals("Partha"))
			System.out.println("a equales Partha");
		
		if(a.equals(b))
			System.out.println("a equals b");
		else
			System.out.println("a doesn't equal b");		
		
		if(a.equalsIgnoreCase(b))
			System.out.println("a equals b");
			
	}
}
