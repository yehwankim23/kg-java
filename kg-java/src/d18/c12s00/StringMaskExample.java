package d18.c12s00;

public class StringMaskExample {

	public static void main(String[] args) {
		String custInfo = "홍길동, 서울, 010-1234-5678, 30, M";
		custInfo = custInfo.replaceAll("\\d{3}-\\d{4}-\\d{4}", "***-****-****");
		System.out.println(custInfo);

		String custInfo2 = "홍길동, 서울, 010-123-5678, 30, M";
		custInfo2 = custInfo2.replaceAll("\\d{3}-\\d{3,4}-\\d{4}", "***-****-****");
		System.out.println(custInfo2);

	}

}
