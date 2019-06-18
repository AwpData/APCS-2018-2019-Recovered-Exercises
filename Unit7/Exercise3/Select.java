import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

// This code is an example of my own selection sort method based on the method Arrays.sort()
public class Select {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		Scanner insertnums = new Scanner(new File("src/numbers.txt"));
		Scanner insertnames = new Scanner(new File("src/names.txt"));
		int[] numbers = new int[0];
		String[] names = new String[0];
		String choice = "";
		int i = 0;
		while (insertnums.hasNextLine()) {
			numbers = Arrays.copyOf(numbers, numbers.length + 1);
			numbers[i] = insertnums.nextInt();
			i++;
		}
		i = 0;
		while (insertnames.hasNextLine()) {
			names = Arrays.copyOf(names, names.length + 1);
			names[i] = insertnames.nextLine();
			i++;
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(names));
		System.out.println();
		while (!choice.equals("3")) {
			System.out.println("Would you like to sort in:");
			System.out.println("1. Ascending Order");
			System.out.println("2. Descending Order");
			System.out.println("3. Quit");
			System.out.println();
			choice = input.nextLine();
			if (choice.equals("1")) {
				upsort(numbers);
				upsort(names);
				System.out.println(Arrays.toString(numbers));
				System.out.println(Arrays.toString(names));
			} else if (choice.equals("2")) {
				downsort(numbers);
				downsort(names);
				System.out.println(Arrays.toString(numbers));
				System.out.println(Arrays.toString(names));
			}
			System.out.println();
		}
	}

	public static void upsort(int[] array) { // ascending order for numbers
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[smallest]) {
					smallest = j;
				}
			}
			swap(array, smallest, i);
		}
	}

	public static void upsort(String[] array) { // ascending order for names
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[smallest].compareTo(array[j]) > 0) {
					smallest = j;
				}
			}
			swap(array, smallest, i);
		}
	}

	public static void downsort(int[] array) { // descending order for numbers
		for (int i = 0; i < array.length - 1; i++) {
			int greatest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[greatest]) {
					greatest = j;
				}
			}
			swap(array, greatest, i);
		}
	}

	public static void downsort(String[] array) { // descending order for names
		for (int i = 0; i < array.length - 1; i++) {
			int greatest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[greatest].compareTo(array[j]) < 0) {
					greatest = j;
				}
			}
			swap(array, greatest, i);
		}
	}

	public static void swap(int[] array, int smallest, int place) { // swaps values in int array
		int temp = array[place];
		array[place] = array[smallest];
		array[smallest] = temp;
	}

	public static void swap(String[] array, int smallest, int place) { // swaps values in string array
		String temp = array[place];
		array[place] = array[smallest];
		array[smallest] = temp;
	}
}
