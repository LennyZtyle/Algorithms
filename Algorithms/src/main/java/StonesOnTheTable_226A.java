import java.io.InputStreamReader;
import java.util.Scanner;

public class StonesOnTheTable_226A {

	public static void main(String[] args) {
		Scanner s = new Scanner(new InputStreamReader(System.in));
		s.nextLine();
		int stonesRemved = 0;
		StringBuilder line = new StringBuilder(s.nextLine());
		for (int i = 0; i < line.length()-1; i++) {
			if(line.charAt(i) == line.charAt(i+1))				
				stonesRemved++;
		}
		System.out.println(stonesRemved);
	}
}
