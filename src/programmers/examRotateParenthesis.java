package programmers;

import java.util.Stack;

public class examRotateParenthesis {
    public static void main(String[] args) {

        String s = "[](){}";
        int answer = 0;

        for(int j=0; j<s.length(); j++) {
                boolean consensus = false;
                Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.pop() == '{') {
                    consensus = true;
                } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.pop() == '[') {
                    consensus = true;
                } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.pop() == '(') {
                    consensus = true;
                }

                if(!stack.isEmpty()){
                    consensus = false;
                }
            }
                if (consensus) {
                    answer++;
                }
                s = s.substring(1, s.length()) + s.substring(0, 1);
        }


        System.out.println(answer);
    }
}
