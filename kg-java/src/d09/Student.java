package d09;

public class Student {
	public String studentID;
	public String name;
	public int age;
	public String contact;
	public int attendanceCount;

	public Student() {

	}

	public Student(String studentID, String name, int age, String contact) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.contact = contact;

	}

	public String getStudentID() {
		return studentID;

	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getContact() {
		return contact;

	}

	public void setContact(String contact) {
		this.contact = contact;

	}

	public int getAttendanceCount() {
		return attendanceCount;

	}

	public void setAttendanceCount() {
		this.attendanceCount = 0;

	}

	public void setAttendanceCount(boolean attendance) {
		if(attendance) {
			this.attendanceCount++;

		}

	}

	@Override
	public String toString() {
		return "Student [학번 = " + studentID + ", 이름 = " + name + ", 나이 = " + age + ",연락처 = " + contact + ", 출석횟수 = "
				+ attendanceCount + "]";
	}

}
