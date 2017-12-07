import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask_118A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

			StringBuilder string = new StringBuilder(r.readLine().toLowerCase());
			for (int i = string.length()-1; i >= 0 ; i--) {
				char currentChar = string.charAt(i);
				if(currentChar=='A'||currentChar=='a'||currentChar=='E'||currentChar=='e'||currentChar=='I'||currentChar=='i'||currentChar=='O'
						||currentChar=='o' ||currentChar=='U'||currentChar=='u'||currentChar=='Y'||currentChar=='y' ){
					string.deleteCharAt(i);
				}else{
					string.insert(i, '.');					
				}
			}
			System.out.println(string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
