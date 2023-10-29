package people;

public class Rectangle extends Shape {

	private double width;
	private double height;
	
	public Rectangle(String color, FillType fillType, double width, double height) {
		
		super(color, fillType);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void displayInfo() {
		
		System.out.println(this.getColor());
		System.out.println(this.getFillType());
		System.out.println(this.getWidth());
		System.out.println(this.getHeight());
	}
	
	
	@Override
	public double getArea() {
		
		return this.getHeight() * this.getWidth();
	}
	
	public double getWidth() {
		return this.width;
	} 
	public double getHeight() {
		return this.height;
	}
}
