import java.io.BufferedInputStream;
import java.util.Scanner;

public class WayTooLongWords_71A {

	public static void main(String[] args) {
		Scanner r = new Scanner(new BufferedInputStream(System.in));
		r.nextLine();		
		while (r.hasNext()) {
			StringBuilder word = new StringBuilder(r.nextLine());
			if (word.length() > 10)
				System.out.println(word.charAt(0) + "" + (word.length() - 2) + "" + word.charAt(word.length() - 1));
			else System.out.println(word);
		}
	}
}
