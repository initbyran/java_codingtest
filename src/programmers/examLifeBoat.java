package exam;

import java.util.Arrays;

public class examLifeBoat {

	public static void main(String[] args) {
		
		int[] people = {40, 50, 60, 70, 80, 90, 100} ;
		int limit = 100;
		
	    Arrays.sort(people);
	   
	 	int i=0;
	 	int j=people.length-1;
	 	
	 	int answer  = 0;
	    while(i<j) {
	    	if(people[i]+people[j]<=limit) {
	    		i++;
	    	}
	    	j--;
	    	answer++;
	    }
	    
	    if(i==j) {
	    	answer ++;
	    }
		
	    
		System.out.println(answer);
		
	
		
	}

}
