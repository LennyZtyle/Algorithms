import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PetyaAndString_112A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			String firstStirng = r.readLine().toLowerCase().trim();
			String secondString = r.readLine().toLowerCase().trim();
			int result = firstStirng.compareTo(secondString);
			if(result < 0)
				System.out.println(-1);
			else if (result > 0)
				System.out.println(1);
			else System.out.println(0);
					
		} catch (Exception e) {
		}

	}

}
