//� A+ Computer Science  -  www.apluscompsci.com
//Name - Luke Epperson
//Date - 2/6/18
//Class - APCSA
//Lab  - 02e

public class Circle
{
	private double radius;
	private double area;
	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea()
	{
		area = radius * 3.14159;
	}

	public void print()
	{
		System.out.println("The area is:" + area);
	}
}