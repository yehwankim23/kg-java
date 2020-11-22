package d16.c09s03;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		ArrayList<String> genericList = new ArrayList<>();

//		list.add("first");
//		list.add("second");
//		list.add("third");
//		list.add(new Integer(4));
//		list.add(new Float(5.0f));

		genericList.add("first");
		genericList.add("second");
		genericList.add("third");

//		String s1 = (String)list.get(0);
		String s2 = genericList.get(0);
//		System.out.println(s1);
		System.out.println(s2);
		for(String s : genericList) {
			System.out.println(s);

		}

	}

}
