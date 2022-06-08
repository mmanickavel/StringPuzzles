package string.preperation;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("hello"));
	}

	static String reverse(String b) {
		char[] a = b.toCharArray();
		int i, n = a.length;
		char t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
		return String.valueOf(a);
	}

}
