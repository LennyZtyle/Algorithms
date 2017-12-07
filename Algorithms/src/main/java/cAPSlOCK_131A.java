import java.io.InputStreamReader;
import java.util.Scanner;

public class cAPSlOCK_131A {

	public static void main(String[] args) {
		Scanner s = new Scanner(new InputStreamReader(System.in));
		StringBuilder word = new StringBuilder(s.nextLine());
		boolean isToChange = true;
		for (int i = 1; i < word.length(); i++) {
			if (!Character.isUpperCase(word.charAt(i))) {
				isToChange = false;
				break;
			}
		}
		if (isToChange)
			System.out.println(word.substring(0, 1).toUpperCase() + "" + word.substring(1).toLowerCase());
		else
			System.out.println(word);
	}
}
