import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomeNote {
	Map<String, Integer> magazineMap;
	String[] Arr;

	public RansomeNote(String magazine, String note) {
		String[] mag = magazine.split(" ");
		Arr = note.split(" ");
		magazineMap = new HashMap<String, Integer>();
		for (int i = 0; i < mag.length; i++) {
			if (magazineMap.get(mag[i]) == null) {
				magazineMap.put(mag[i], 1);
			} else {
				int count = magazineMap.get(mag[i]);
				magazineMap.put(mag[i], ++count);
			}
		}

	}

	public boolean solve() {
		for (int i = 0; i < Arr.length; i++) {
			if (magazineMap.get(Arr[i]) != null && (magazineMap.get(Arr[i]) > 0)) {
				int count = magazineMap.get(Arr[i]);
				magazineMap.put(Arr[i], --count);
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		RansomeNote s = new RansomeNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	

}
