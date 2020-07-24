
public class Circle extends Shape
{
	private double radius;
	private final double pi = 3.14;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	

	public double calculatePerimeter()
	{
		double perimeter = 2 * this.pi * this.radius;
		return perimeter;
	}
	
	public double calculateArea()
	{
		double area = this.pi * this.radius * this.radius;
		return area;
	}

}
