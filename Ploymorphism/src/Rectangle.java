
public class Rectangle extends Shape {

	private double height;
	private double width;
	
	public Rectangle(double height, double width)
	{
		super();
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double calculatePerimeter()
	{
		double perimeter = (this.width + this.height) *2;
		return perimeter;
	}
	
	public double calculateArea()
	{
		double area = this.width * this.height;
		return area;
	}
}

