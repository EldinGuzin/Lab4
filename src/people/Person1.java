package people;
import java.util.*;

public class Person1 {

	
	private String name;
	private String address;
	private String country;
	private int age;
	
	public Person1(String name,String address,String country,int age ) {
		
		this.name = name;
		this.address = address;
		this.country = country;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
	public String getCountry() {
		return this.country;
	}
	public int getAge() {
		return this.age;
	}
	
}
