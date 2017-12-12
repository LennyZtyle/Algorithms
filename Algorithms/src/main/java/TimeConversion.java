import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder time = new StringBuilder(s.nextLine());

		if (time.charAt(time.length() - 2) == 'A') {

			if (time.substring(0, 2).compareTo("12") == 0) {
				time.replace(0, 2, "00");
			}
			time.replace(time.length() - 2, time.length(), "");
		} else {
			String hourValue = Integer.parseInt(time.substring(0, 2)) + 12 + "";
			if (time.substring(0, 2).compareTo("12") == 0) {
				hourValue = "12";
			}
			time.replace(0, 2, hourValue).replace(time.length() - 2, time.length(), "");
		}
		System.out.println(time.toString());
	}
}
