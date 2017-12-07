import java.io.InputStreamReader;
import java.util.Scanner;

public class DominoPiling_50A {

	public static void main(String[] args) {
		Scanner s = new Scanner(new InputStreamReader(System.in));
		String line = s.nextLine();
		int M = Integer.parseInt(line.split(" ")[0]);
		int N = Integer.parseInt(line.split(" ")[1]);
		if(M%2==0){
			System.out.println((M/2)*N);
		}else if(N%2==0){
			System.out.println((N/2)*M);
		}else{
			int res = (int) (Math.floorDiv(M, 2)*N+Math.ceil(N/2));
			System.out.println(res);
		}
	}
}
