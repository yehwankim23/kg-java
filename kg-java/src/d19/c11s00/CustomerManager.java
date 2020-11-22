package d19.c11s00;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

import d19.c11s00.Customer;

public class CustomerManager {
	static final int MAX_CUSTOMERS = 100;
	static int customerCount = 0;
	static Customer[] customerList = new Customer[MAX_CUSTOMERS];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다.");
		System.out.println("고객 정보를 불러옵니다.");
		importCustomerData();
		System.out.println();

		while(true) {
			System.out.println(customerCount + "개의 고객 정보가 있습니다.");
			System.out.println("메뉴를 입력하세요.");
			System.out.print("[I]NSERT, [P]RINT, [U]PDATE, [D]ELETE, PRINT [A]LL, [Q]UIT : ");
			char menu = scanner.next().toUpperCase().charAt(0);

			switch(menu) {
			case 'I':
				if(customerCount < MAX_CUSTOMERS) {
					System.out.println("고객 정보를 입력합니다.");
					insertCustomerData();

				} else {
					System.out.println("고객 정보를 더 이상 입력할 수 없습니다.");

				}
				break;

			case 'P':
				if(0 < customerCount) {
					System.out.println("고객 정보를 출력합니다.");
					printCustomerData(selectCustomerData());

				} else {
					System.out.println("출력할 고객 정보가 없습니다.");

				}
				break;

			case 'U':
				if(0 < customerCount) {
					System.out.println("고객 정보를 수정합니다.");
					updateCustomerData(selectCustomerData());

				} else {
					System.out.println("수정할 고객 정보가 없습니다.");

				}
				break;

			case 'D':
				if(0 < customerCount) {
					System.out.println("고객 정보를 삭제합니다.");
					deleteCustomerData(selectCustomerData());

				} else {
					System.out.println("삭제할 고객 정보가 없습니다.");

				}
				break;

			case 'A':
				if(0 < customerCount) {
					System.out.println("고객 정보를 출력합니다.");
					printAllCustomerData();

				} else {
					System.out.println("고객 정보가 없습니다.");
				}
				break;

			case 'Q':
				System.out.println("고객 정보를 내보냅니다.");
				exportCustomerData();
				System.out.print("프로그램을 종료합니다.");
				quitCustomerManager();
				break;

			default:
				System.out.println("잘못된 메뉴입니다.");
				break;

			}
			System.out.println();

		}

	}

	public static void importCustomerData() {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader("customerData.txt");
			bufferedReader = new BufferedReader(fileReader);
			String data = null;

			while((data = bufferedReader.readLine()) != null) {
				String[] temp = data.split(", ");

				Customer customer = new Customer();

				customer.setName(temp[0].toUpperCase());
				customer.setGender(temp[1].toUpperCase().charAt(0));
				customer.setEmail(temp[2].toUpperCase());
				customer.setBirthYear(Integer.parseInt(temp[3]));

				customerList[customerCount] = customer;
				customerCount++;

			}

		} catch(Exception e) {
			System.out.println(e.getMessage());

		} finally {
			if(bufferedReader != null) {
				try {
					bufferedReader.close();

				} catch(Exception e) {

				}

			}

		}
		System.out.println(customerCount + "개의 고객 정보를 불러왔습니다.");

	}

	public static void insertCustomerData() {
		Customer customer = new Customer();

		while(true) {
			System.out.print("이름 : ");
			String name = scanner.next().toUpperCase();

			if(name.contains(" ")) {
				System.out.println("잘못된 입력입니다.");

			} else {
				if(checkCustomerName(name)) {
					customer.setName(name);
					break;

				} else {
					System.out.println("중복되는 이름입니다.");

				}

			}

		}

		while(true) {
			System.out.print("성별 : ");
			char gender = scanner.next().toUpperCase().charAt(0);

			if(gender == 'F' | gender == 'M') {
				customer.setGender(gender);
				break;

			} else {
				System.out.println("잘못된 입력입니다.");

			}

		}

		while(true) {
			System.out.print("이메일 : ");
			String email = scanner.next().toUpperCase();

			if(email.contains(" ")) {
				System.out.println("잘못된 입력입니다.");

			} else {
				customer.setEmail(email);
				break;

			}

		}

		while(true) {
			System.out.print("출생년도 : ");
			int birthYear = scanner.nextInt();

			if(birthYear < 1850 | 2150 < birthYear) {
				System.out.println("잘못된 입력입니다.");

			} else {
				customer.setBirthYear(birthYear);
				break;

			}

		}

		customerList[customerCount] = customer;
		customerCount++;

		System.out.println("고객 정보를 입력했습니다.");

	}

	public static Customer selectCustomerData() {
		while(true) {
			System.out.println("출력, 수정, 또는 삭제할 고객의 이름을 입력하세요.");
			System.out.print("이름 : ");
			String name = scanner.next().toUpperCase();

			if(name.contains(" ")) {
				System.out.println("잘못된 입력입니다.");

			} else {
				for(int i = 0; i < customerCount; i++) {
					if(customerList[i].getName().equals(name)) {
						return customerList[i];

					}

				}
				System.out.println("입력한 이름을 가진 고객이 없습니다.");

			}

		}

	}

	public static void printCustomerData(Customer customer) {
		System.out.println(customer.toString());

	}

	public static void updateCustomerData(Customer customer) {
		while(true) {
			System.out.print("이름 : " + customer.getName() + " -> ");
			String name = scanner.next().toUpperCase();

			if(name.contains(" ")) {
				System.out.println("잘못된 입력입니다.");

			} else {
				if(checkCustomerName(name)) {
					customer.setName(name);
					break;

				} else {
					System.out.println("중복되는 이름입니다.");

				}

			}

		}

		while(true) {
			System.out.print("성별 : " + customer.getGender() + " -> ");
			char gender = scanner.next().toUpperCase().charAt(0);

			if(gender == 'F' | gender == 'M') {
				customer.setGender(gender);
				break;

			} else {
				System.out.println("잘못된 입력입니다.");

			}

		}

		while(true) {
			System.out.print("이메일 : " + customer.getEmail() + " -> ");
			String email = scanner.next().toUpperCase();

			if(email.contains(" ")) {
				System.out.println("잘못된 입력입니다.");

			} else {
				customer.setEmail(email);
				break;

			}

		}

		while(true) {
			System.out.print("출생년도 : " + customer.getBirthYear() + " -> ");
			int birthYear = scanner.nextInt();

			if(birthYear < 1850 | 2150 < birthYear) {
				System.out.println("잘못된 입력입니다.");

			} else {
				customer.setBirthYear(birthYear);
				break;

			}

		}

		System.out.println("고객 정보를 수정했습니다.");

	}

	public static boolean checkCustomerName(String name) {
		int count = 0;

		for(int i = 0; i < customerCount; i++) {
			if(name.toUpperCase().equals(customerList[i].getName())) {
				count++;

			}

		}

		if(count == 0) {
			return true;

		} else {
			return false;

		}

	}

	public static void deleteCustomerData(Customer customer) {
		if(customerCount == MAX_CUSTOMERS) {
			int index = -1;

			for(int i = 0; i < customerCount; i++) {
				if(customerList[i].getName().equals(customer.getName())) {
					index = i;

				}

			}

			customerList[index].setName(customerList[MAX_CUSTOMERS - 1].getName());
			customerList[index].setGender(customerList[MAX_CUSTOMERS - 1].getGender());
			customerList[index].setEmail(customerList[MAX_CUSTOMERS - 1].getEmail());
			customerList[index].setBirthYear(customerList[MAX_CUSTOMERS - 1].getBirthYear());

			customerList[MAX_CUSTOMERS - 1].setName(" ");

		} else {
			for(int i = 0; i < customerCount; i++) {
				if(customerList[i].getName().equals(customer.getName())) {
					for(int j = i; j < customerCount - 1; j++) {
						customerList[j] = customerList[j + 1];

					}

				}

			}

		}
		customerCount--;
		System.out.println("고객 정보를 삭제했습니다.");

	}

	public static void printAllCustomerData() {
		for(int i = 0; i < customerCount; i++) {
			System.out.println(customerList[i].toString());

		}
		System.out.println(customerCount + "개의 고객 정보를 출력했습니다.");

	}

	public static void exportCustomerData() {
		FileOutputStream fileOutputStream = null;
		String[] data = new String[customerCount];

		try {
			fileOutputStream = new FileOutputStream("customerData.txt");
			String name = null;

			for(int i = 0; i < customerCount; i++) {
				name = customerList[i].getName();

				if(name != " ") {
					data[i] = name + ", " + customerList[i].getGender() + ", " + customerList[i].getEmail() + ", " + customerList[i].getBirthYear();
					fileOutputStream.write(data[i].getBytes());
					fileOutputStream.write('\n');

				}

			}
			System.out.println(customerCount + "개의 고객 정보를 내보냈습니다.");

		} catch(Exception e) {
			System.out.println(e.getMessage());

		} finally {
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();

				} catch(Exception e) {

				}

			}

		}

	}

	public static void quitCustomerManager() {
		scanner.close();
		System.exit(0);

	}

}
