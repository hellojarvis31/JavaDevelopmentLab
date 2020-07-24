
public class Main {
	
	public static void main(String[] args)
	{
	
		Shape rectangle = new Rectangle(2 , 5);
		Shape circle = new Circle(2.5);
		
		System.out.print("Area of rectangle: ");
		System.out.println(rectangle.calculateArea());
		
		System.out.print("perimeter of rectangle: ");
		System.out.println(rectangle.calculatePerimeter());
		
		
		System.out.print("Area of circle: ");
		System.out.println(circle.calculateArea());
		
		
		System.out.print("perimeter of circle: ");
		System.out.println(circle.calculatePerimeter());
	}
	
	
	
	

}
