import java.util.*;

class Rectangle
{
	private double length, width, area;
	private String color;

	void setLength(double length)
	{
		this.length = length;
	}

	void setWidth(double width)
	{
		this.width = width;
	}

	void setColor(String color)
	{
		this.color = color;
	}

	double findArea()
	{
		return length*width;
	}

	String getColor()
	{
		return color;
	}
}

class labset1
{
	public static void main(String[] args) {
		double length, width;
		String color;
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Enter Length of the Rectangle1");
		length = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Width of the Rectangle1");
		width = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Color of the Rectangle1");
		color = sc.nextLine();
		rectangle1.setLength(length);
		rectangle1.setWidth(width);
		rectangle1.setColor(color);

		Rectangle rectangle2 = new Rectangle();
		System.out.println("Enter Length of the Rectangle2");
		length = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Width of the Rectangle2");
		width = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Color of the Rectangle2");
		color = sc.nextLine();
		rectangle2.setLength(length);
		rectangle2.setWidth(width);
		rectangle2.setColor(color);

		if((rectangle1.findArea() == rectangle1.findArea()) && rectangle1.getColor().equalsIgnoreCase(rectangle2.getColor()))
			System.out.println("Matching Rectangles!");
		else
			System.out.println("Non Matching Rectangles!");
	}
}