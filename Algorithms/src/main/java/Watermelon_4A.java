import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon_4A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			
			int w = Integer.parseInt(r.readLine());
			if(w%2==0 && w>2)
				System.out.println("YES");
			else
				System.out.println("NO");
		} catch (NumberFormatException | IOException e) {			
			e.printStackTrace();
		}

	}

}
