package exam;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class exam15235 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Map<Integer, Integer> pizzaMap = new HashMap<>();
		Queue<Integer> queue = new LinkedList<>();
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(int i=1; i<=N; i++ ) {
			pizzaMap.put(i,sc.nextInt());
		    queue.add(i);
		}
		
		int count = 0;	
		while(queue.size()!=0) {

			count ++;
			int num = queue.poll();
				
			if(pizzaMap.get(num)== 1) {	
				countMap.put(num, count);
				pizzaMap.put(num, 0);
			} else {
	    	    queue.add(num);
	    	    int left = pizzaMap.get(num)-1;
                pizzaMap.put(num, left);               
			}
	
		}
		
		for(int i=1; i<=N; i++) {
			System.out.print(countMap.get(i)+" ");
		}
	}
}
