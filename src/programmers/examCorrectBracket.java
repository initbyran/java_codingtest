package exam;

import java.util.Stack;

public class examCorrectBracket {

public static void main(String[] args) {
		
		String s = "(()())";
		
		boolean answer = true;
		
		char[] split = s.toCharArray();
		Stack<Character> stack = new Stack<>();

		if (split[0]==')' || split[s.length() - 1]=='(') {
			answer = false;
		} else {
			stack.add('(');
			for (int i = 1; i < split.length; i++) {
				
				if (!stack.isEmpty() && split[i]==')' && stack.peek()=='(') {
					stack.pop();					
				} else {
					stack.add(split[i]);
				} 

			}
			if(stack.size()!=0) {
				answer = false;
			}
		}
		System.out.println(answer);
		

	}

}
