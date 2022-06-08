package string.preperation;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		removeDuplicateChar();
		removeDuplicateCharFromString();
	}
	
	static void removeDuplicateChar() {
		String str = "dividers";
		char charArr[] = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		for (char c : charArr) {
			charSet.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		System.out.println(sb);

	}

	static void removeDuplicateCharFromString() {
		String str = "dividers";
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (!str1.contains(String.valueOf(str.charAt(i)))) {
				str1 = str1 + String.valueOf(str.charAt(i));
			}
		}
		System.out.println(str1);
	}

}
