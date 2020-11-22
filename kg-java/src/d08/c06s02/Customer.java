package d08.c06s02;

public class Customer {
	public String name;
	public char gender;
	public String email;
	public int birthYear;

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public char getGender() {
		return gender;

	}

	public void setGender(char gender) {
		this.gender = gender;

	}

	public String getEmail() {
		return email;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public int getBirthYear() {
		return birthYear;

	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;

	}

	@Override
	public String toString() {
		return "Customer [이름 = " + name + ", 성별 = " + gender + ", 이메일 = " + email + ", 출생년도 = " + birthYear + "]";

	}

}
