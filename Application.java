package demoCalculator;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		int result = list
				.stream()
				.filter(i -> i > 4)
				.mapToInt(i -> i)
				.sum();
		System.out.println(result); 

		List<String> listString = new ArrayList<String>();
		listString.add("Mango");
		listString.add("Cat");
		listString.add("Cup");
		listString.add("Dog");
		listString.add("Rat");
		listString.add("Couple");
		listString.add("Friend");
		
		
		listString
		.stream()
		.filter(i -> i.startsWith("C"))
		.forEach(i -> System.out.println(i));
	}
}
