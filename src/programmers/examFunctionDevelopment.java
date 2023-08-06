package exam;

import java.util.ArrayList;
import java.util.List;

public class examFunctionDevelopment {

	public static void main(String[] args) {
		
		int[] progresses = {93, 30, 55, 70, 60, 55};
		int[] speeds = {1, 30, 5, 1, 20, 9} ;
		
		
		int[] dayLeft = new int[progresses.length];
		for(int i=0; i<progresses.length; i++) {
			if((100-progresses[i])%speeds[i]==0) {
				dayLeft[i] = (100-progresses[i])/speeds[i];
			} else {
				dayLeft[i] = ((100-progresses[i])/speeds[i])+1;
			}
		}
		
		List<Integer> alist = new ArrayList<>();
	    alist.add(dayLeft[0]);  
	   
		for(int i=1; i<dayLeft.length; i++) {
			if(dayLeft[i-1] > dayLeft[i]) {
				dayLeft[i]=dayLeft[i-1];
			} 
		}
		
		List<Integer> blist = new ArrayList<>();
		int count = 0;
		for(int i=0; i<dayLeft.length-1; i++) {
			if(dayLeft[i] == dayLeft[i+1]) {
				count ++;
			} else {
				count ++;
				blist.add(count);
				count = 0;
			} 
		}
		blist.add(count+1);
		
		int[] answer = new int[blist.size()];
		for(int i=0; i<blist.size(); i++) {
			answer[i] = blist.get(i);
			
		}
		
		
	
		
		
	}

}
