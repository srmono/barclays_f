package oops;

public class Student {
	//data: data members: instance variable : props
	int studentId;
	String studentName;
	String studentCity;
	
	// non parameterized constructor
	public Student() {
		System.out.println("Creating object");
	}
	
	public Student(int st) {
		System.out.println("parameterized constructor");
	}
	
	public Student(String st) {
		System.out.println("parameterized constructor");
	}
	
	public Student(int studentId, String studentName, String studentCity) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	
	//Behaviour : member methods : methods (functions)
	
	public void study() {
		System.out.println(studentName + " is studying");
	}
	
	public void study(float f) {
		System.out.println(studentName + " is studying");
	}
	
	public void showFullDetails() {
		System.out.println("My id is: " + studentId);
		System.out.println("My name is: " + studentName);
		System.out.println("My city is: " + studentCity);
	}
	
}
