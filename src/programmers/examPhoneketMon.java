package exam;

import java.util.HashSet;
import java.util.Set;

public class examPhoneketMon {

	public static void main(String[] args) {
		
		int[] nums = {3,3,3,2,2,2};
		
		int k = nums.length/2;
		
	    Set<Integer> set = new HashSet<>();
	    
	    for(int n : nums) {
	    	set.add(n);
	    }
	    
	    int answer = 0;
	    
	    if(set.size()>k) {
	    	answer = k;
	    } else {
	    	answer = set.size();
	    }
	    
	    System.out.println(answer);
		
		
		
	}

}
