package string.preperation;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstLetterCapitalForEachWord {

	public static void main(String[] args) {
		System.out.println(firstLetterCapitalWithSingleSpace("i love programming"));
		System.out.println(firstLetterCapitalWithSingleSpace2("i i love programming"));
	}

	static String firstLetterCapitalWithSingleSpace(String words) {
		
		return Stream.of(words.trim().split("\\s")).filter(word -> word.length() > 0)
				.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" "));
	}

	static String firstLetterCapitalWithSingleSpace2(String givenString) {
		
		String[] arr = givenString.split(" ");
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}
}
