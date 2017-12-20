import java.util.Arrays;

public class MakeArrayConsecutive2 {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 3, 8 };

		Arrays.sort(arr);
		int missing = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				missing += arr[i + 1] - arr[i]-1;
			}
		}
		System.out.println(missing);
	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
