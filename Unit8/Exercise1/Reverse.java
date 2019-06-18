public class Reverse {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = "AP Computer Science";
		String newString = "";
		int index = 0;
		if (s == null) {
			System.out.println("null");
		} else {
			reverse(s, newString, index);
		}
	}

	public static void reverse(String s, String newString, int index) {
		if (index == s.length()) { // base case
			System.out.println(newString);
		} else if (index != s.length()) { // recursive case
			newString += s.charAt(s.length() - index - 1);
			index++;
			reverse(s, newString, index);
		}
	}
}
