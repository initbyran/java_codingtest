package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam2891 {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		int R = sc.nextInt();
		
		
		Map<Integer,Integer> sMap = new HashMap<Integer,Integer>();
        for(int i=0; i<S ; i++) {
        	int s = sc.nextInt();
        	sMap.put(s,0);
        }
        Map<Integer,Integer> rMap = new HashMap<Integer,Integer>();
        for(int i=0; i<R ; i++) {
        	int r = sc.nextInt();
        	rMap.put(r,1);
        }
        
        
        for(int rNum : rMap.keySet()) {
            int kayak = rMap.get(rNum);        	
      
            
        	for(int sNum : sMap.keySet()) {
	        	int count = sMap.get(sNum);
	        	if (sNum == rNum) {
	        	    kayak --;	
	        	    rMap.put(rNum, kayak);
	        	} else if(count==0 && (sNum == (rNum-1) || sNum == (rNum+1)) && kayak==1) {
	        		S = S-1;
	        		kayak --;
	        		rMap.put(rNum, kayak);
	        		count ++;
	        		sMap.put(sNum, count);
        	}
        	}}
        
        if(S<0) {
            S=0;
        }
        
        System.out.println(S);
        
	}

}
