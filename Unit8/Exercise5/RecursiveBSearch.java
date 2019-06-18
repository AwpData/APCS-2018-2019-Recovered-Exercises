public class RecursiveBSearch {
	public static void main(String[] args) {
		int target = 7;
		int[] array = { 0, 3, 6, 8, 14, 45, 46, 69, 88, 99 };
		int min = 0;
		int max = array.length - 1;
		System.out.println(target + " found at index " + binarySearch(array, target, min, max));
	}

	public static int binarySearch(int[] array, int target, int min, int max) {
		int mid = (min + max) / 2;
		if (array[mid] == target) { // base case #1
			return mid;
		}
		if (min > max) { // base case #2
			return -1;
		} else if (array[mid] < target) { // recursive case #1
			min = mid + 1;
			return binarySearch(array, target, min, max);
		} else if (array[mid] > target) { // recursive case #2
			max = mid - 1;
			return binarySearch(array, target, min, max);
		}
		return -1;
	}
}
