package exam;

import java.util.Stack;

public class examCrainGame {

	public static void main(String[] args) {
		

	int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
	int[] moves = {1,5,3,5,1,2,1,4};
	
	Stack<Integer> stack = new Stack<>();
	int count = 0;
	for(int i=0; i<moves.length; i++) {
		int k = moves[i]-1;
	   for(int j=0; j<board.length; j++) {
		   if(board[j][k]!=0) {
			   if(!stack.isEmpty() && stack.peek()==board[j][k]) {
				   stack.pop();
				   count++;
				   board[j][k]=0;
			   } else {
				   stack.add(board[j][k]);
				   board[j][k]=0;
			   }
			 break;  
		   }
	   }
	}
	int answer = count*2;
	System.out.println(answer);
	
	
	}	
}
