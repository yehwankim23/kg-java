package d16.c09s02;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	public int compare(Employee obj1, Employee obj2) {
		return obj1.name.compareTo(obj2.name);

	}

}
