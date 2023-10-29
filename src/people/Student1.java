package people;

import java.util.ArrayList;

public class Student1 {

	int student_id;
	String student_name;
	ArrayList<Integer> grades = new ArrayList<>();
	
	public Student1(int student_id, String student_name) {
		this.student_id = student_id;
		this.student_name = student_name;
	}
	
	public void addGrade(int grade) {
		
		grades.add(grade);
	}
	
	public int getStudent_id() {
		
		return this.student_id;
	}
	
	public void setStudent_id(int id) {
		
		this.student_id = id;
		
	}
	
	public ArrayList<Integer> getGrades(){
		
		return grades;
	}
	
}
