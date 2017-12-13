
public class CheckPalindrome {

	public static void main(String[] args) {
		String pal = "aaabaaa";
		boolean res = true;
		for (int i = 0; i < pal.length()/2; i++) {
			if (pal.charAt(i) != pal.charAt(pal.length() - (i + 1))) {
				res = false;
				break;
			}
			
		}

		if(res) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
