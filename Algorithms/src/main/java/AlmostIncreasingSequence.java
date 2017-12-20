
public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int[] sequence = { 1, 2, 1 };
		System.out.println(almostIncreasingSequence(sequence));
	}

	private static boolean almostIncreasingSequence(int[] sequence) {

		boolean isValid = true;
		int ref = sequence[0];
		int j = 1;

		while (isValid && j + 1 < sequence.length - 1 && sequence[j] > ref) {
			ref = sequence[j];
			j++;
			if (isValid)
				isValid = false;
			else {
				return false;
			}
		}

		for (int i = j; i < sequence.length; i++) {

			if (sequence[i] - 1 != ref) {
				if (isValid) {
					isValid = false;
				} else {
					return isValid;
				}
			} else {
				ref = sequence[i];
			}

		}
		return true;

	}

}
