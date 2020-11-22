package d09;

import java.util.Scanner;

public class StudentManager {
	static final int MAX = 100;

	static Student[] studentList = new Student[MAX];

	static int index = -1;
	static int count = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n[INFO] 학생 수 : %d 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(A)ttendance, (I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");

			String menu = scan.next();
			menu = menu.toLowerCase();

			switch(menu.charAt(0)) {
			case 'a':
				System.out.println("(A)ll, (I)ndividual");

				String menu1 = scan.next();
				menu1 = menu1.toLowerCase();

				checkStudentAttendance(menu1.charAt(0));
				break;

			case 'i':
				System.out.println("학생정보 입력을 시작합니다.");

				if(count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");

				} else {
					insertStudentData();
					System.out.println("학생정보를 저장했습니다.");

				}
				break;

			case 'p':
				System.out.println("이전 데이터를 출력합니다.");

				if(index <= 0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");

				} else {
					index--;
					printStudentData(index);

				}
				break;

			case 'n':
				System.out.println("다음 데이터를 출력합니다.");

				if(index >= count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");

				} else {
					index++;
					printStudentData(index);

				}
				break;

			case 'c':
				System.out.println("현재 데이터를 출력합니다.");

				if(index >= 0 && index < count) {
					printStudentData(index);

				} else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'u':
				System.out.println("데이터를 수정합니다.");

				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateStudentData(index);

				} else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'd':
				System.out.println("데이터를 삭제합니다.");

				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteStudentData(index);

				} else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'q':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);

			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");

			}

		}

	}

	public static void checkStudentAttendance(char type) {
		if(type == 'a') {
			for(int i = 0; i < count; i++) {
				studentList[i].setAttendanceCount(true);

			}

		} else if(type == 'i') {
			System.out.println("true/false");
			for(int i = 0; i < count; i++) {
				System.out.print(studentList[i].getName() + " : ");
				studentList[i].setAttendanceCount(scan.nextBoolean());

			}


		} else {
			System.out.println("메뉴를 잘 못 입력했습니다.");

		}

	}

	public static void insertStudentData() {
		Student s1 = new Student();

		System.out.print("학번 : ");
		s1.setStudentID(scan.next());
		System.out.print("이름 : ");
		s1.setName(scan.next());
		System.out.print("나이 : ");
		s1.setAge(scan.nextInt());
		System.out.print("연락처 : ");
		s1.setContact(scan.next());
		s1.setAttendanceCount();

		studentList[count] = s1;
		count++;

	}

	public static void printStudentData(int index)	{
		System.out.println(studentList[index].toString());

	}

	public static void updateStudentData(int index) {
		System.out.print("학번(" + studentList[index].getStudentID() + ") : ");
		studentList[index].setStudentID(scan.next());

		System.out.print("이름(" + studentList[index].getName() + ") : ");
		studentList[index].setName(scan.next());

		System.out.print("나이(" + studentList[index].getAge() + ") : ");
		studentList[index].setAge(scan.nextInt());

		System.out.print("연락처(" + studentList[index].getContact() + ") : ");
		studentList[index].setContact(scan.next());

	}

	public static void deleteStudentData(int index) {
		if(count == MAX) {
			count--;

		} else {
			for(int i = index; i < count - 1; i++) {
				studentList[i] = studentList[i + 1];

			}

		}
		count--;

	}

}
