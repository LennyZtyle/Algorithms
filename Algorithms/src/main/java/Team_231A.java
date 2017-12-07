import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Team_231A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int result = 0;
			int problems = Integer.parseInt(r.readLine());
			for (int i = 0; i < problems; i++) {
				String solve = r.readLine();
				if (solve.split(" ")[0].compareTo("1") == 0 && solve.split(" ")[1].compareTo("1") == 0)
					result++;
				else if (solve.split(" ")[0].compareTo("1") == 0 && solve.split(" ")[2].compareTo("1") == 0)
					result++;
				else if (solve.split(" ")[1].compareTo("1") == 0 && solve.split(" ")[2].compareTo("1") == 0)
					result++;
			}
			System.out.println(result);
		} catch (Exception e) {
		}
	}
}
