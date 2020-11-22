package d16.c09s02;

public class Employee {
	String name;
	int salary;

	public Employee() {}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;

	}

	public String toString() {
		return name + ":" + salary;

	}

}
