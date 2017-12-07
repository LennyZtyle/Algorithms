import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RunningMedia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] a = new double[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextDouble();
        }
        
        DecimalFormat df = new DecimalFormat("##.#");
        double [] partialArr = new double[a.length];
        for (int i = 0; i < a.length; i++) {        	
        	partialArr[i]=a[i];
        	Arrays.sort(partialArr);
        	for (int j = 0; j < partialArr.length && partialArr[j]!=0; j++) {
        	
			}
		}
	}

}
