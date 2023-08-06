package exam;

import java.util.LinkedList;
import java.util.Queue;

public class examHateSameNum {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(arr.length);
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]!=arr[i]) {
				q.offer(arr[i]);
			}
		}
		
		int size = q.size();
		int[] answer = new int[size];
		for(int i=0; i<size; i++) {
			answer[i]=q.poll();
			
		}
	}

}
