package string.preperation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagramSort("players", "parsley"));
		System.out.println(isAnagramCounting("cider", "cried"));
	}
	
	static boolean isAnagramSort(String str1, String str2) {
		char[] a1 = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
		char[] a2 = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();
		Arrays.sort(a1);
		System.out.println(a1);
		Arrays.sort(a2);
		System.out.println(a2);
		return Arrays.equals(a1, a2);
	}
		
	private static int CHARACTER_RANGE= 26;

	static boolean isAnagramCounting(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    int count[] = new int[CHARACTER_RANGE];
	    for (int i = 0; i < string1.length(); i++) {
	        count[string1.charAt(i) - 'a']++;
	        count[string2.charAt(i) - 'a']--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
