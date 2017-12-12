import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int candles = s.nextInt();
		int highest = 0;
		int amount = 0;
		for (int i = 0; i < candles; i++) {
			int currentCadle = s.nextInt();
			if (currentCadle > highest) {
				highest = currentCadle;
				amount = 1;
			} else if (currentCadle == highest) {
				amount++;				
			}
		}
		System.out.println(amount);
	}

}
