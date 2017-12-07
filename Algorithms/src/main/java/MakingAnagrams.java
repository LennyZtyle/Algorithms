import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {
		// vemslisewjk
		// asdlkjfaalskdjfaiemcal

		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println("lenght of A: "+a.length());
		System.out.println("lenght of B: "+b.length());
		System.out.println(numberNeeded(a, b));
	}

	private static int numberNeeded(String a, String b) {
		int posA;
		int posB;
		int partialCount;
		int count = 0;
		int [] aa= new int [4];
		for(int i = 0; i < a.length(); i++){
			for (int j = 0; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)){
					System.out.println(a.charAt(i)+" __"+b.charAt(j));
					posA = i+1;
					posB = j+1;
					partialCount = 1;
					while(posA< a.length() && posB < b.length()&& (a.charAt(posA) == b.charAt(posB))){
						//System.out.println(a.charAt(posA)+" __"+b.charAt(posB));
						System.out.println("more than one");
						posA++;
						posB++;
						partialCount++;
					}
					System.out.println("partial count:"+partialCount);
					if(partialCount>count){
						count = partialCount;
					}					
				}
			}			
		}
		return (a.length()-count)+(b.length()-count);
	}

}
