package string.preperation;

public class RemoveNonAlphanumericAndCheckPalindrom {

	public static void main(String[] args) {

		System.out.println(removeNonAlphanumericAndCheckPalindrom("I am :IronnorI Ma, i"));
	}

	static Boolean removeNonAlphanumericAndCheckPalindrom(String str) {

		str = str.replaceAll("[^a-zA-Z0-9]", "");
		String S = str.replaceAll("\\s+", "").toLowerCase();
		int j = S.length() - 1;
		int i = 0;
		while (j > i) {
			if (S.charAt(i++) != S.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

}
