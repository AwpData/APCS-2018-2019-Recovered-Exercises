public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(fibonacci(i));
		}
	}

	public static int fibonacci(int num) {
		if (num < 2) { //base case
			return num;
		} else { // recursive case
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
