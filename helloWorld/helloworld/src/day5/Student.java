package day5;

public class Student extends Person {

	private String schoolName;

	public Student(String name, int age) {
		super(name, age);
	}

	public Student(String schoolName) {
		this(" ", 0);
		this.schoolName = schoolName;
	}

	public Student(String name, int age, String schoolName) {
		this(name, age);
		this.schoolName = schoolName;
		
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void showInfo() {
		System.out.println(super.getName() + "(" + super.getAge() + ")" + this.schoolName);
	}
}
