package d10.c07s04;

public class Student extends Person {
	private String studentID;

	public Student(String name, int age, String studentID) {
		super(name, age);
		this.studentID = studentID;

	}

	public String getDetails() {
		return super.getDetails() + "\t학번: " + studentID;

	}

	public void study() {

	}

}
