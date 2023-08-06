package exam;

import java.util.Stack;

public class examDeletePair {

	public static void main(String[] args) {
		
		String s = "baabaa";
		
		char[] ch = s.toCharArray();
		int length = ch.length;
		Stack<Character> stack = new Stack<>();
		
		stack.push(ch[0]);
		
		for(int i=1; i<length; i++){
			if(!stack.isEmpty()&& stack.peek()==ch[i]) {
				stack.pop();
			} else {
				stack.push(ch[i]);
			}
		}
		int answer =0;
		if(stack.isEmpty()) {
			answer = 1;
		}
		System.out.println(answer);
		
		
		

	}

}
