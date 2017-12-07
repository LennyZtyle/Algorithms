import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }

	}

	private static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char charAt = expression.charAt(i);
			if(isToAdd(charAt)){				
				stack.push(charAt);
			}else{				
				if(!stack.isEmpty() && validateIncoming(stack.peek(), charAt)){
					stack.pop();					
				}else{					
					return false;					
				}				
			}
		}
		return true;
	}

	private static boolean validateIncoming(char charOpen, char charCloses) {		
		if((charOpen=='(' && charCloses==')') || (charOpen=='[' && charCloses==']') || (charOpen=='{' && charCloses=='}')){			
			return true;				
		}
		return false;
	}

	private static boolean isToAdd(char c) {
		if(c=='{' || c=='[' || c=='('){
			return true;
		}
		else return false;
	}
}
