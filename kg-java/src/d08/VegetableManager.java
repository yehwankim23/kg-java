package d08;

import java.util.Scanner;

public class VegetableManager {
	static final int MAX = 100;

	static Vegetable[] vegList = new Vegetable[MAX];

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
		Vegetable v1 = new Vegetable();

		System.out.print("이름 : ");
		v1.setName(scan.next());
		System.out.print("수량 : ");
		v1.setAmount(scan.nextInt());
		System.out.print("유통기한 : ");
		v1.setExpDate(scan.nextInt());

		vegList[index] = v1;
		count++;

	}

	private static void printVegetableData(int index) {
		System.out.println(vegList[index].toString());

	}

	private static void updateVegetableData(int index) {
		System.out.print("이름(" + vegList[index].getName() + ") : ");
		vegList[index].setName(scan.next());

		System.out.print("수량(" + vegList[index].getAmount() + ") : ");
		int amount = scan.nextInt();
		if(amount == 0) {
			System.out.println("데이터를 삭제합니다.");
			System.out.println(index + "번째 데이터를 삭제합니다.");
			deleteVegetableData(index);

		} else {
			vegList[index].setAmount(amount);

			System.out.print("유통기한(" + vegList[index].getExpDate() + ") : ");
			vegList[index].setExpDate(scan.nextInt());;

		}

	}

	private static void deleteVegetableData(int index) {
		if(count == MAX) {
			count--;

		} else {
			for(int i = index; i < count - 1; i++) {
				vegList[i] = vegList[i + 1];

			}

		}
		count--;

	}

}
