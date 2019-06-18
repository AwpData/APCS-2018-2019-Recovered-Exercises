import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

public class BinarySearch {
	public static void main(String[] args) throws FileNotFoundException {
		int[] nums = new int[0];
		String[] names = new String[0];
		int i = 0;
		Scanner NumElements = new Scanner(new File("src/NumSearch.txt"));
		Scanner NameElements = new Scanner(new File("src/NameSearch.txt"));
		while (NumElements.hasNextLine()) {
			nums = Arrays.copyOf(nums, nums.length + 1);
			nums[i] = NumElements.nextInt();
			i++;
		}
		i = 0;
		while (NameElements.hasNextLine()) {
			names = Arrays.copyOf(names, names.length + 1);
			names[i] = NameElements.nextLine();
			i++;
		}
		System.out.println(Arrays.toString(nums));
		Arrays.sort(names, Pattern.CASE_INSENSITIVE, 20);
		System.out.println(Arrays.toString(names));
		System.out.println();
		System.out.println("Number 5 found in nums at index of " + binarySearch(nums, 5));
		System.out.println("Number 9 found in nums at index of " + binarySearch(nums, 9));
		System.out.println("Number 43 found in nums at index of " + binarySearch(nums, 43));
		System.out.println("Number 79 found in nums at index of " + binarySearch(nums, 79));
		System.out.println();
		System.out.println("Name Dennis found in names at index of " + binarySearch(names, "Dennis"));
		System.out.println("Name Billy-Bob found in names at index of " + binarySearch(names, "Billy-Bob"));
		System.out.println("Name Steve found in names at index of " + binarySearch(names, "Steve"));
	}

	public static int binarySearch(String[] array, String target) {
		int min = 0;
		int max = array.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (target.compareTo(array[mid]) > 0) {
				min = mid + 1;
			} else if (target.compareTo(array[mid]) < 0) {
				max = mid - 1;
			} else if (target.compareTo(array[mid]) == 0) {
				return mid; // target found
			}
		}
		return -1; // target not found
	}

	public static int binarySearch(int[] array, int target) {
		int min = 0;
		int max = array.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (array[mid] < target) {
				min = mid + 1;
			} else if (array[mid] > target) {
				max = mid - 1;
			} else if (array[mid] == target) {
				return mid; // target found
			}
		}
		return -1; // target not found
	}
}
