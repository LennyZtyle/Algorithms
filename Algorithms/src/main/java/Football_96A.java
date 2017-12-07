import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Football_96A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			String players = r.readLine();
			if(players.contains("1111111")|| players.contains("0000000"))
				System.out.println("YES");
			else System.out.println("NO");		
		} catch (Exception e) {
		}
	}
}
