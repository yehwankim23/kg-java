package d16.c09s02;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동", 20000);
		Employee e2 = new Employee("김진숙", 30000);
		Employee e3 = new Employee("허현정", 70000);
		Employee e4 = new Employee("이순신", 40000);

		TreeSet<Employee> list = new TreeSet<Employee>(new EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		for(Employee s : list) {
			System.out.println(s);

		}

	}

}
