package sample1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="When I was six years old, I saw a picture in a book."
				+ " It was a picture of a snake who was eating a big animal."
				+ " Here is a copy of the picture.";
		List<String> sortedWords=Arrays.stream(text.split(" "))
				.filter(word->word.matches(".*[aeiouAEIOU]*"))
				.sorted((w1, w2) -> Integer.compare(countVowels(w1), countVowels(w2)))
				.collect(Collectors.toList());
		System.out.println(sortedWords);
	}
	private static int countVowels(String word) { 
		return (int) word.chars() 
				.filter(c -> "aeiouAEIOU"
				.indexOf(c) != -1) 
				.count();
}
}