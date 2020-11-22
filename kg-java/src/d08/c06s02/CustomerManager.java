package d08.c06s02;

import java.util.Scanner;

public class CustomerManager {
	static final int MAX = 100;

	static Customer[] cusList = new Customer[MAX];

	static int index = -1;
	static int count = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");

			String menu = scan.next();
			menu = menu.toLowerCase();

			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");

				if(count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");

				} else {
					insertCustomerData();
					System.out.println("고객정보를 저장했습니다.");

				}
				break;

			case 'p':
				System.out.println("이전 데이터를 출력합니다.");

				if(index <= 0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");

				} else {
					index--;
					printCustomerData(index);

				}
				break;

			case 'n':
				System.out.println("다음 데이터를 출력합니다.");

				if(index >= count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");

				} else {
					index++;
					printCustomerData(index);

				}
				break;

			case 'c':
				System.out.println("현재 데이터를 출력합니다.");

				if(index >= 0 && index < count) {
					printCustomerData(index);

				} else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'u':
				System.out.println("데이터를 수정합니다.");

				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomerData(index);

				} else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'd':
				System.out.println("데이터를 삭제합니다.");

				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteCustomerData(index);

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

	public static void insertCustomerData() {
		Customer c1 = new Customer();

		System.out.print("이름 : ");
		c1.setName(scan.next());
		System.out.print("성별(M/F) : ");
		c1.setGender(scan.next().charAt(0));
		System.out.print("이메일 : ");
		c1.setEmail(scan.next());
		System.out.print("출생년도 : ");
		c1.setBirthYear(scan.nextInt());

		cusList[count] = c1;
		count++;

	}

	public static void printCustomerData(int index)	{
		System.out.println(cusList[index].toString());

	}

	public static void updateCustomerData(int index) {
		System.out.print("이름(" + cusList[index].getName() + ") : ");
		cusList[index].setName(scan.next());

		System.out.print("성별(" + cusList[index].getGender() + ") : ");
		cusList[index].setGender(scan.next().charAt(0));

		System.out.print("이메일(" + cusList[index].getEmail() + ") : ");
		cusList[index].setEmail(scan.next());

		System.out.print("출생년도(" + cusList[index].getBirthYear() + ") : ");
		cusList[index].setBirthYear(scan.nextInt());

	}

	public static void deleteCustomerData(int index) {
		if(count == MAX) {
			count--;

		} else {
			for(int i = index; i < count - 1; i++) {
				cusList[i] = cusList[i + 1];

			}

		}
		count--;

	}

}
