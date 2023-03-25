
class ThrowsExcep
{
	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");//why demo is not printed !!!
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main.");
          //  System.out.println(e.getMessage());
		}
	}
}

