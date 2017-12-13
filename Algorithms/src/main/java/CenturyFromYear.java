import java.util.Scanner;

public class CenturyFromYear {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if (year % 100 == 0) {
			System.out.println(year / 100);
		} else {
			System.out.println((year / 100) + 1);
		}
	}

}
