import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tram_116A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int stops = Integer.parseInt(r.readLine());
			int minCapacity = 0;
			int total = 0;			
			for (int i = 0; i < stops; i++) {
				String line = r.readLine();			
				int out = Integer.parseInt(line.split(" ")[0]);
				int in = Integer.parseInt(line.split(" ")[1]);
				total+= -out+in;
				if(total>minCapacity)
					minCapacity = total;					
			}
			System.out.println(minCapacity);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
