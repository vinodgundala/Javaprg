class Z16
{
	static int i;
		static
	{
		System.out.println("Z17.SIB");
	}
}
class Z17
{
static
	{
	System.out.println("Z17.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
System.out.println(Z16);
System.out.println("main end");
	}
}
