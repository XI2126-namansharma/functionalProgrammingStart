package demoCalculator;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class PracticeJava8 {

	public static void main(String[] args) {
		// list of integers
		List<Integer> number = Arrays.asList(2,3,4,5);

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2,3,4,5,2);

		// create a list of String

		List<String> names =
				Arrays.asList("Reflection","Collection","Stream");

		// use map
		int additionOfSquere = number
				.stream()
				.mapToInt(i -> i*i)
				.sum();
		System.out.println(additionOfSquere);

		//use filter and collect
		List<Integer> result1 = numbers
				.stream()
				.filter(i -> i%2==0)
				.collect(Collectors.toList());
		System.out.println(result1);

		// use sorted and collect
		List<String> result2 = names
				.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result2);

		// use forEach
		names
		.stream()
		.filter(i -> i.startsWith("S"))
		.forEach(i -> System.out.println(i));

		// use reduce
		int addEven = numbers
				.stream()
				.filter(i -> i%2==0)
				.reduce(0,(i,j)->i+j);
		System.out.println(addEven);

		List<String> strings = Arrays
				.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		
		// print the number of empty strings
		//using java7
		int count =0;
		for(int i=0; i<strings.size(); i++) {
			if(strings.get(i)=="") {
				count++;
			}
		}
		System.out.println(count);
		//using java8
		int count1 = (int) strings
				.parallelStream()
				.filter(string->string.equals(""))
				.count();
		System.out.println(count1);

		// Eliminate empty string and join using comma
		String answerString = strings
				.parallelStream()
				.filter(string->!string.equals(""))
				.collect(Collectors.joining(","));
		System.out.println(answerString);
		
		List<Integer> newIntegers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
		// Get the Highest number in the list
		OptionalInt highest = newIntegers
				.stream()
				.mapToInt(i -> i)
				.max();
		System.out.println(highest);
		
		//Lowest number in List
		OptionalInt lowest = newIntegers
				.stream()
				.mapToInt(i -> i)
				.min();
		System.out.println(lowest);
		
		// sum of all numbers
		int sumOfNo = newIntegers
				.stream()
				.mapToInt(i->i)
				.sum();
		System.out.println(sumOfNo);
		
		// average of all numbers
		OptionalDouble avgOfNo = newIntegers
				.stream()
				.mapToInt(i->i)
				.average();
		System.out.println(avgOfNo);
		
		// get list of square of distinct numbers
		List<Integer> sqrNo = newIntegers
				.stream()
				.map(i->i*i)
				.collect(Collectors.toList());
		System.out.println(sqrNo);
	}
}
