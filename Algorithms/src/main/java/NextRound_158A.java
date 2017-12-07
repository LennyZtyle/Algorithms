import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound_158A {

	public static void main(String[] args) {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			String firstLine = r.readLine();
			int totalParticipants = Integer.parseInt(firstLine.split(" ")[0]);
			int participantPosition = Integer.parseInt(firstLine.split(" ")[1]);			
			String[] arrayScores = r.readLine().split(" ");
			int extraParticipants = 0;			
			if (Integer.parseInt(arrayScores[participantPosition - 1]) > 0) {
				for (int i = participantPosition; i < totalParticipants; i++) {
					if (Integer.parseInt(arrayScores[i - 1]) <= Integer.parseInt(arrayScores[i]))
						extraParticipants++;
					else break;
				}
				System.out.println(participantPosition+extraParticipants);
			}
			else {
				for (int i = 0; i < participantPosition-1; i++) {
					if(Integer.parseInt(arrayScores[i])>0)
						extraParticipants++;
				}
				System.out.println(extraParticipants);
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
