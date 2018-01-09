
public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int[] sequence = { 1,2,1,2};
		System.out.println(almostIncreasingSequence(sequence));
	}

	private static boolean almostIncreasingSequence(int[] sequence) {
		boolean isValid = true;
		int ref = 0;
		for (int i = 0; i < sequence.length; i++) {
			if (i == 0) {
				ref = sequence[0];
			} else {
				if (sequence[i] < ref) {
					if (isValid) {
						isValid = false;
						ref = sequence[i];
					} else {
						return false;
					}
				} else if (sequence[i] - 1 != ref) {
					if (isValid) {
						isValid = false;
					} else {
						return isValid;
					}
				} else {
					ref = sequence[i];
				}
			}
		}
		return true;
	}
}
