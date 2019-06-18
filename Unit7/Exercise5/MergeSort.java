import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class MergeSort {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Scanner names = new Scanner(new File("src/names.txt"));
		Scanner numbers = new Scanner(new File("src/numbers.txt"));
		Scanner input = new Scanner(System.in);
		String choice = "";
		ArrayList<String> tempnames = new ArrayList<>();
		ArrayList<Integer> tempnumbers = new ArrayList<>();

		while (names.hasNextLine()) {
			tempnames.add(names.nextLine());
		}
		
		while (numbers.hasNextLine()) {
			tempnumbers.add(numbers.nextInt());
		}
		
		while (!choice.equals("0")) {
			System.out.println();
			System.out.println(tempnumbers);
			System.out.println(tempnames);
			System.out.println("\nWhat would you like to do? \n 1. Add a name \n 2. Add a number \n 3. Sort each array and print it \n (TERMINATES THE PROGRAM)");
			choice = input.nextLine();
			
			if (choice.equals("1")) {
				System.out.println("What name would you like to add?");
				String name = input.nextLine();
				tempnames.add(name);
				
			} else if (choice.equals("2")) {			
				System.out.println("What number would you like to add?");
				int num = input.nextInt();
				tempnumbers.add(num);
				
			} else if (choice.equals("3")) {				
				String[] Names = tempnames.toArray(new String[tempnames.size()]);
				int[] Numbers = new int[tempnumbers.size()];

				for (int i = 0; i < Numbers.length; i++) { // adds the elements from the arraylist to the array
					Numbers[i] = tempnumbers.get(i);
				}
				
				System.out.println();
				mergeSort(Numbers);
				mergeSort(Names);
				System.out.println(Arrays.toString(Numbers));
				System.out.println(Arrays.toString(Names));
				System.out.println();
				break;
			}
		}
		System.out.println("Done sorting...Quitting program");
	}

	public static void mergeSort(int[] a) {
		if (a.length > 1) {
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		}
	}

	public static void mergeSort(String[] a) {
		if (a.length > 1) {
			String[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			String[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		}
	}

	public static void merge(String[] result, String[] left, String[] right) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < result.length; i++) {
			// System.out.println(Arrays.toString(result));
			if (i2 >= right.length || (i1 < left.length && left[i1].compareTo(right[i2]) <= 0)) {
				result[i] = left[i1];
				i1++;
			} else {
				result[i] = right[i2];
				i2++;
			}
		}
	}

	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < result.length; i++) {
			//System.out.println(Arrays.toString(result));
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1];
				i1++;
			} else {
				result[i] = right[i2];
				i2++;
			}
		}
	}
}
