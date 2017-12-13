import java.util.Scanner;

public class ShapeArea {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int value = 0;
		while (value != -1) {
			System.out.println("-1 to exit or input size of shape");
			value = s.nextInt();

			int square = value * 2 - 1;
			int remove = getRemoveVal(value);
			System.out.println((square * square) - (remove * 4));

		}

	}

	private static int getRemoveVal(int value) {
		int remove = 0;
		for (int i = 0; i < value; i++) {
			remove += i;
		}
		return remove;
	}

}
