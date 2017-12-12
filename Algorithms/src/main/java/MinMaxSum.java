import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Long sum = 0l;
		for (int arr_i = 0; arr_i < 5; arr_i++) {
			int currentValue = in.nextInt();
			if (min >= currentValue) {
				min = currentValue;
			}
			if (max <= currentValue) {
				max = currentValue;
			}
			sum += currentValue;
		}
		System.out.println((sum - max) + " " + (sum - min));
	}
}
