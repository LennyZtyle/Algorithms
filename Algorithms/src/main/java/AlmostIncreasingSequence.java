import java.util.ArrayList;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		 int[] sequence = { 1, 2, 1, 3, 4, 5 };
		//int[] sequence = { 5, 1, 2, 3, 6 };
		System.out.println(almostIncreasingSequence(sequence));
	}

	private static boolean almostIncreasingSequence(int[] sequence) {
		ArrayList<Integer> listPositionBreak = new ArrayList<Integer>();
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] > sequence[i + 1] - 1) {
				listPositionBreak.add(i);
			}
		}
		Integer firstEntry = listPositionBreak.get(0);
		int valuePos = sequence[firstEntry];
		if (listPositionBreak.size() == 1) {
			if (firstEntry == 0) {
				return true;
			} else if (firstEntry == sequence.length - 2) {
				return true;
			} else {
				int valuePosRefernce = sequence[firstEntry + 2];
				if (valuePos == valuePosRefernce - 1) {
					return true;
				} else {
					return false;
				}

			}
		} else if (listPositionBreak.size() == 2) {
			int valueLastPos = sequence[listPositionBreak.get(1)+1];			
			if (valuePos == valueLastPos - 1) {
				return true;
			}
			else {
				return false;
			}
		} else {
			return false;
		}
	}
}
