package string.preperation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("redivider"));
		System.out.println(isPalindromeOne("redivider"));
		System.out.println(isPalindromReverseTheString("redivider"));
		System.out.println(isPalindromPossible("redivider"));
	}

	static int isPalindrome(String text) {
		// code here
		String S = text.replaceAll("\\s+", "").toLowerCase();
		int j = S.length() - 1;
		int i = 0;
		while (j > i) {
			if (S.charAt(i++) != S.charAt(j--)) {
				return 0;
			}
		}
		return 1;

	}

	static int isPalindromeOne(String S) {

		return S.equals(new StringBuilder(S).reverse().toString()) ? 1 : 0;

	}
	
	static String isPalindromReverseTheString(String text) {
		
		StringBuilder reverse = new StringBuilder();
		char[] clean = text.replaceAll("\\s+", "").toLowerCase().toCharArray();
		for(int i = clean.length - 1; i >= 0; i--) {
			reverse.append(clean[i]);
		}		
		return reverse.toString();
		
	}
	
	static int isPalindromPossible(String S) {
		
		HashMap<Character,Integer> counting = new HashMap<Character, Integer>();
		
		for(char ch: S.toCharArray()) {
			if(counting.containsKey(ch)) {
				counting.put(ch, counting.get(ch)+1);
			} else {
				counting.put(ch, 1);
			}
		}
		
		//find the odd number of elements
		
		int oddCount = 0;
		char oddChar = 0;
		for(Map.Entry<Character, Integer> itr: counting.entrySet()) {
			if(itr.getValue() % 2 != 0) {
				oddCount++;
				oddChar = itr.getKey();
			}
		}
		
		if(oddCount > 1 || (oddCount == 1 && S.length() % 2 == 0)) {
			return 0;
		} else {
			return 1;
		}
		
	}

}
