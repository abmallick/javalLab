class Stack
{
	int top;
	int stck[] = new int[5];
	Stack()
	{
		top = -1;
	}

	void push(int val)
	{
		if(top < 4)
		{
			stck[++top] = val;
			System.out.println("Element inserted is: "+val);
		}
		else
		{
			System.out.println("Stack Overflow");
		}
	}

	int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
			return stck[top--];
	}
}

class TestStack
{
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.pop());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		return;
	}
}