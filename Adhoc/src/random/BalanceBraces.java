package random;

import java.util.Scanner;
import java.util.Stack;

// input
/*3
{[()]}
{[(])}
{{[[(())]]}}*/

public class BalanceBraces {

	    public static boolean isBalanced(String expression) {
	        Stack<Character> s= new Stack<>();
	       for (char c : expression.toCharArray()) {
	    if      (c == '{') s.push('}');
	    else if (c == '[') s.push(']');
	    else if (c == '(') s.push(')');
	    else {
	      if (s.empty() || c != s.peek())
	        return false;
	        else
	      s.pop();
	    }
	  }
	  return s.empty();
	        }
	     
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++) {
	            String expression = in.next();
	            boolean answer = isBalanced(expression);
	            if(answer)
	                System.out.println("YES");
	            else System.out.println("NO");
	        }
	    }
}
