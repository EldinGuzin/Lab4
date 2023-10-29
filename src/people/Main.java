package people;

import java.util.*;

public class Main {

	public static void printDepartment (List<Person> people) {
		
		for(Person s: people) {
			System.out.println(s.getName());
			
		}
		
				
		
	}
	
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Teacher("Pekka Mikkola", "Korsonite Street 1 03100 Vantaa", 1200));
		people.add(new Teacher("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki", 1200));
		
		printDepartment(people);
		
		
//		Shape shape = new Shape("blue", FillType.FILLED);
//		
//		shape.displayInfo();
//		
//		Circle circle = new Circle("red", FillType.NOT_FILLED, 10);
//		circle.displayInfo();
//		System.out.println(circle.getArea());
//		System.out.println(circle.calculateCircumference(circle.getRadius()));
//		System.out.println(circle.calculateCircumference(3.14, circle.getRadius()));
		
		Rectangle rectangle = new Rectangle("orange",FillType.FILLED, 10,5);
		System.out.println(rectangle.getArea());
		//rectangle.displayInfo();
		
		//Person pekka = new Person("Pekka Mikkola", "Korsonite Street 1 03100 Vantaa");
		
		//Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
		
		//Teacher pekka = new Teacher("Pekka Mikkola", "Korsonite Street 1 03100 Vantaa", 1200);
		
		//Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki", 1200);
		
		//Student olli = new Student("Olli", "Ida Albergintie Street 1 00500 Helsinki");
		
//		for(int i = 0; i<25; i++) {
//			
//			olli.study();
//		}
//		System.out.println(olli.getCredits());
//
//		System.out.println("credits: " + olli.getCredits());
//		olli.study();
//		System.out.println("credits: " + olli.getCredits());
		
		
//		System.out.println(pekka);
//		System.out.println(esko);
		
		
		Student1 TestStudent = new Student1(20, "Elda");
		TestStudent.addGrade(5);
		TestStudent.addGrade(10);
		
		System.out.println(TestStudent.getGrades());
		
	}

}
