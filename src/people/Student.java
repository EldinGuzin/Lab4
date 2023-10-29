package people;

public class Student extends Person {

	private int credits = 0;
	
	
	public Student(String name, String address) {
		
		super(name,address);
	}
	
	public void study() {
		
		this.credits += 5;
	}
	
	public int getCredits() {
		
		return credits;
	}
}
