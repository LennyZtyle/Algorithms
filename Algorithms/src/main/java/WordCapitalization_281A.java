import java.util.Scanner;

public class WordCapitalization_281A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder word = new StringBuilder(s.nextLine());
		if(Character.isUpperCase(word.charAt(0))){
			System.out.println(word.toString());
		}else{			
			word.deleteCharAt(0);
			word.insert(0, Character.toUpperCase(word.charAt(0)));		
			System.out.println(word.toString());
		}
	}
}
