
public abstract class Shape {

	private double perimeter;
	private double area;
	
	public void setPerimeter(double perimeter)
	{
		this.perimeter = perimeter;
	}
	
	public double getPerimeter()
	{
		return this.perimeter;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public double getArea()
	{
		return this.area;
	}
	
	public abstract double calculatePerimeter();
	public abstract double calculateArea();
}
