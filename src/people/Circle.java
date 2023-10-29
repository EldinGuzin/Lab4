package people;

public class Circle extends Shape {

	private double radius;
	
	public Circle(String color, FillType fillType, double radius) {
		
		super(color, fillType);
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public void displayInfo() {
		
		System.out.println(this.getColor());
		System.out.println(this.getFillType());
		System.out.println(this.radius);
	}
	
	@Override
	public double getArea() {
		
		return this.radius * this.radius;
	}
	
	public double calculateCircumference(double PI, double r) {
		
		return PI * r;
	}
	
	public double calculateCircumference(double r) {
		
		double PI = 3.14;
		return PI * r;
	}
	
}
