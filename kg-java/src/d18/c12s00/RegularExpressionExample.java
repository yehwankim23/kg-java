package d18.c12s00;

public class RegularExpressionExample {

	public static void main(String[] args) {
		String strl = "HelloWorld";
		if(strl.matches("HelloWorld")) {
			System.out.println("HelloWorld");
			
		}
		if(strl.matches("Hello.....")) {
			System.out.println("Hello.....");
			
		}
		if(strl.matches("Hel+oWorld")) {
			System.out.println("Hel+oWorld");
			
		}
		strl = "NiceWorld";
		if(strl.matches("(Hello | Nice)world")) {
			System.out.println("(Hello | Nice)World");
			
		}
		if(strl.matches("\\w*")) {
			System.out.println("w를 포함한 영숫자");
			
		}

	}

}
