import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int amountValues = s.nextInt();
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		for(int i = 0; i< amountValues; i++){
			int val = s.nextInt();
			if(val>0){
				positive++;
			}else if(val<0){
				negative++;
			}else{
				zeros++;
			}
		}
		System.out.println((double) positive/amountValues);
		System.out.println((double) negative/amountValues);
		System.out.println((double) zeros/amountValues);
	}

}
