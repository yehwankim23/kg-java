package d10.c07s03;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public void setDay(int d) {
		if(d < 1 || d > 31) {
			System.out.println("잘못된 날짜입력입니다");
			day = 1;

		} else {
			day = d;

		}

	}

	public int getDay() {
		return day;

	}

	public int getMonth() {
		return month;

	}

	public void setMonth(int month) {
		this.month = month;

	}

	public int getYear() {
		return year;

	}

	public void setYear(int year) {
		this.year = year;

	}

}
