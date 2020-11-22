package d07;

import java.util.Scanner;

public class VegetableManager {
	static final int MAX = 100;

	static String[] nameList = new String[MAX];
	static int[] amountList = new int[MAX];
	static String[] expDateList = new String[MAX];

	static int index = -1;
	static int count = 0;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n[INFO] 야채 수 : %d 인덱스 : %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");

			String menu = scan.next();
			menu = menu.toLowerCase();

			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("야채정보 입력을 시작합니다.");

				if(count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");

				} else {
					insertVegetableData();
					System.out.println("야채정보를 저장했습니다.");

				}
				break;

			case 'p':
				System.out.println("이전 데이터를 출력합니다.");

				if(index <= 0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");

				} else {
					index--;
					printVegetableData(index);

				}
				break;

			case 'n':
				System.out.println("다음 데이터를 출력합니다.");

				if(index >= count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");

				} else {
					index++;
					printVegetableData(index);

				}
				break;

			case 'c':
				System.out.println("현재 데이터를 출력합니다.");

				if(index >= 0 && index < count) {
					printVegetableData(index);

				} else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'u':
				System.out.println("데이터를 수정합니다.");

				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateVegetableData(index);

				} else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");

				}
				break;

			case 'd':
				System.out.println("데이터를 삭제합니다.");

				if(index >= 0 && index < count) {
					System.out.println(index + "번째 데이터를 삭제합니다.");
					deleteVegetableData(index);

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

	private static void insertVegetableData() {
		System.out.print("이     름 : ");
		String name = scan.next();
		System.out.print("수     량 : ");
		int amount = scan.nextInt();
		System.out.print("유통기한 : ");
		String expDate = scan.next();

		nameList[count] = name;
		amountList[count] = amount;
		expDateList[count] = expDate;
		count++;

	}

	private static void printVegetableData(int index) {
		System.out.println("========VEGETABLE INFO========");
		System.out.println("이     름 : " + nameList[index]);
		System.out.println("수     량 : " + amountList[index]);
		System.out.println("유통기한 : " + expDateList[index]);
		System.out.println("==============================");

	}

	private static void updateVegetableData(int index) {
		System.out.println("-----UPDATE CUSTOMER INFO-----");

		System.out.print("이     름(" + nameList[index] + ") : ");
		nameList[index] = scan.next();

		System.out.print("수     량(" + amountList[index] + ") : ");
		int amount = scan.nextInt();
		if(amount == 0) {
			System.out.println("데이터를 삭제합니다.");
			System.out.println(index + "번째 데이터를 삭제합니다.");
			deleteVegetableData(index);

		} else {
			amountList[index] = amount;

			System.out.print("유통기한(" + expDateList[index] + ") : ");
			expDateList[index] = scan.next();

		}

	}

	private static void deleteVegetableData(int index) {
		for(int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i + 1];
			amountList[i] = amountList[i + 1];
			expDateList[i] = expDateList[i + 1];

		}
		count--;

	}

}
