class Outer
{
	int a, b;
	Outer()
	{
		a = b = 0;
	}

	class Inner
	{
		int c;

		int getC()
		{
			return c;
		}
	}
}

class Main
{
	public static void main(String[] args) {
	Outer o = new Outer();

	Outer.Inner i =  o.new Inner();

	i.c = 3;
	System.out.println(i.getC());	
	}
	
}