import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taxi_158B {

	public static void main(String[] args) {
		try {			
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int numberOfGroups = Integer.parseInt(r.readLine());
			
			String []peopleByGroupString = r.readLine().split(" ");
			
			int[] peopleByGroupInteger = new int[4];
			for (int i = 0; i < numberOfGroups; i++) {				
				peopleByGroupInteger[Integer.parseInt(peopleByGroupString[i])-1]++;				
			}			
			int totalCabs = peopleByGroupInteger[3];
			peopleByGroupInteger[3]=0;
			while(peopleByGroupInteger[0]!=0 && peopleByGroupInteger[2]!=0){
				totalCabs++;
				peopleByGroupInteger[0]--;
				peopleByGroupInteger[2]--;
			}			
			if(peopleByGroupInteger[0]==0){						
				totalCabs+=(peopleByGroupInteger[1]%2==1?(peopleByGroupInteger[1]/2)+1:(peopleByGroupInteger[1]/2))+peopleByGroupInteger[2];
			}
			else{
				int twoPeopleRemeider = peopleByGroupInteger[1]%2;
				totalCabs+=peopleByGroupInteger[1]/2;
				if(twoPeopleRemeider==0){					
					totalCabs+= peopleByGroupInteger[0]<4?1:peopleByGroupInteger[0]/4;
					totalCabs+= (peopleByGroupInteger[0]%4!=0&&peopleByGroupInteger[0]>4)?1:0;
				}
				else {
					totalCabs++;
					if(peopleByGroupInteger[0]>2){
						totalCabs+=(peopleByGroupInteger[0]-2)%4==0?(peopleByGroupInteger[0]-2)/4:((peopleByGroupInteger[0]-2)/4)+1;
					}
					
				}
			}											
			System.out.println(totalCabs);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void printArray(int[] peopleByGroupInteger) {
		for (int i = 0; i < peopleByGroupInteger.length; i++) {
			System.out.print(peopleByGroupInteger[i]+" ");			
		}
		System.out.println();
	}
}
