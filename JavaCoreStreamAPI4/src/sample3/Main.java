package sample3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(4, 12, 45, 67, 89, 23, 56); 
		List<Integer> sortedNumbers = numbers.stream() 
				.filter(num -> num > 10) 
				.sorted((n1, n2) -> Integer.compare(n1 % 10, n2 % 10)) 
				.collect(Collectors.toList()); 
		System.out.println(sortedNumbers); 
	}

}
