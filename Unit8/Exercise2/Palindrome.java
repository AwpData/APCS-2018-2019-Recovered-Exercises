import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean PalindromeConfirmed = false;
		System.out.println("Enter a sentence or word");
		String words = input.nextLine(); // This will be shown in output
		String Lowercase = words.toLowerCase(); // This makes all the characters the same
		String s = Lowercase.replaceAll("[!,?,.,:,,,-,$,%,^,(,),#,<,>,/,;,',@,+,=,_,{,},[,],|,~,`,*]", ""); // Gets rid of special chars
		int index = 0;
		PalindromeConfirmed = palindrome(s, index);
		System.out.println();
		if (PalindromeConfirmed) {
			System.out.println("\"" + words + "\" is a palindrome");
		} else {
			System.out.println("\"" + words + "\" is not a palindrome");
		}
	}

	public static boolean palindrome(String s, int index) {
		char c1 = s.charAt(index);
		char c2 = s.charAt(s.length() - index - 1);
		if (c1 == c2) {
			return true;
		}
		if (!(c1 == c2)) {
			return false;
		}
		if (c1 == c2 && index > 0) {
			palindrome(s, index - 1);
			return true;
		}
		return false;
	}
}
