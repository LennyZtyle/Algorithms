import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HelpfulMaths_339A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			String values[] = r.readLine().split("\\+");

			Integer intValues []=new Integer[values.length];
			for (int i = 0; i<values.length ; i++) {
				intValues[i] = Integer.parseInt(values[i]);
			}			
			Arrays.sort(intValues);
			printArray(intValues);				
		} catch (Exception e) {
			// TODO: handle exception
		}

	}	
	public static void printArray(Object[] arr){
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + (i==arr.length-1?"":"+"));			
		}
		System.out.println();
	}
}
