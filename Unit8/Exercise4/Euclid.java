public class Euclid {
	public static void main(String[] args) {
		System.out.println(gcd(16, 4));
	}

	public static int gcd(int num1, int num2) {
		if (num1 % num2 == 0) { // base case
			int gcd = num2;
			return gcd;
		} else { // recursive case
			return gcd(num2, num1 % num2);
		}
	}
}
