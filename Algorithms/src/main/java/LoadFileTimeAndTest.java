import java.io.BufferedReader;
import java.io.FileReader;

public class LoadFileTimeAndTest {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\lenier.beltran\\Downloads\\times_file.txt";	
		String line = null;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		try {		
			FileReader fileReader = new FileReader(fileName);		
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int i = 0;
			int totalTime = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if(line.startsWith("TIME SPENT")){
					int time = Integer.parseInt(line.split(" ")[6]);
					System.out.println(time);
					if(time>max){
						max = time;
					}
					if(time<min){
						min = time;
					}
					totalTime+=time;					
				}
				i++;
			}
			System.out.println("Average Time in seconds: "+(totalTime/i));
			System.out.println("Minimum in seconds: "+min);
			System.out.println("Maximum in seconds: "+max/1000);
			System.out.println("Total time: "+totalTime/1000/60);
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
