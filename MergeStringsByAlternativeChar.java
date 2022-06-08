package string.preperation;

public class MergeStringsByAlternativeChar {

	public static void main(String[] args) {
		
		System.out.println(merge("Hello", "Bye"));
	}
	
	static String merge(String S1, String S2) {

		StringBuffer Str3 = new StringBuffer();
		for (int i = 0; i < S1.length() || i < S2.length(); i++) {
			if (i < S1.length())
				Str3.append(S1.charAt(i));
			if (i < S2.length())
				Str3.append(S2.charAt(i));
		}
		return Str3.toString();
	}

}
