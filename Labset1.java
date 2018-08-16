class Methods
{
	int a, b;
	
	Methods(int a)
	{
		this.a = a;
	}

	void compute(int a)
	{
		System.out.println("a+val = "+(this.a+a));
	}

	void compute(int a, int b)
	{
		System.out.println("a+val1+val2 = "+(this.a+a+b));	
	}
}

class Test
{
	public static void main(String[] args) {
		Methods m = new Methods(2);
		m.compute(2);
		m.compute(2,3);
	}
}