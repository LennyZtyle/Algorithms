import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		for(int i=0; i<size; i++){
			StringBuilder sb = new StringBuilder();
			buildSpaces(size-i-1, sb);
			buildPounds(i,sb);
			System.out.println(sb);
		}
	}

	private static void buildPounds(int pos, StringBuilder addPounds) {
		addPounds.append("#");
		for(int i = 0; i<pos;i++){
			addPounds.append("#");
		}		
	}

	private static void buildSpaces(int spaces, StringBuilder addSpaces) {
		for(int i = 0; i<spaces;i++){
			addSpaces.append(" ");
		}
	}
}
