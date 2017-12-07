import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BitPlusPlus_282A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int operations = Integer.parseInt(r.readLine());
			int result = 0;
			for (int i = 0; i < operations; i++) {
				String opp = r.readLine();
				if (opp.contains("-"))
					result--;
				else
					result++;
			}
			System.out.println(result);
		} catch (Exception e) {
		}

	}

}
