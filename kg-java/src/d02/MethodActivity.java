package d02;

public class MethodActivity {

	public static void main(String[] args) {
		String a = "Hello ";
		String b = "World";

		addAndPrintStrings(a, b);
		System.out.println(addStrings(a, b));

	}

	public static void addAndPrintStrings(String i, String j) {
		System.out.println(i + j);

	}

	public static String addStrings(String i, String j) {
		return i + j;

	}

}
