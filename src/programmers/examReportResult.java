package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class examReportResult {

	public static void main(String[] args) {
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;

		Set<String> set = new HashSet<>(Arrays.asList(report));
		
		Map<String, Integer> rMap = new HashMap<>();
				
	    for(String id : set) {
	    	String[] arr = id.split(" ");
	    	rMap.putIfAbsent(arr[1], 0);
        	rMap.computeIfPresent(arr[1], (key, value)->value+1);
	    }
	    
	    List<String> badId = new ArrayList<>();
	    	    
	    for(Map.Entry<String, Integer> entry : rMap.entrySet()) {
	    	if(entry.getValue()>=k) {
	    		badId.add(entry.getKey());
	    	}
	    }
	    
	    List<String> resultList = new ArrayList<>();
	    for(String badid : badId) {
	    	for(String id : set){
        		String[] arr = id.split(" ");
        		if(arr[1].equals(badid)) {
        			resultList.add(arr[0]);
        			System.out.println("mail"+arr[0]);
        					
        		}
        	}
	    }
	    
        
//        Map<String, Integer> resultMap = new HashMap<>();
//        for(String badid : badId) {
//        	for(String id : set){
//        		String[] arr = id.split(" ");
//        		if(arr[1].equals(badid)) {
//                	resultMap.putIfAbsent(arr[0], 0);
//                	resultMap.computeIfPresent(arr[0], (key, value)->value+1);
//                } else {for(String id : set){
//        		String[] arr = id.split(" ");
//                	resultMap.putIfAbsent(arr[0], 0);
//                }
//           
//        	}
//        }
//
	    int[] answer = new int[id_list.length];

	    for(int i=0; i< id_list.length; i++) {
	    	int count =0 ;
	    	for(String mail : resultList) {
	    		if(id_list[i].equals(mail)) {
	    			count ++;
	    		}
	    	}
	    	answer[i] = count;
	    }
	    
//	       for(int i=0; i<id_list.length; i++) {
//        	if(resultMap.containsKey(id_list[i])) {
//        		int email = resultMap.get(id_list[i]);	
//        		answer[i]=email;
//        	} else {
//        		answer[i]=0;
//        	}
//        	System.out.println(answer[i]);
//        }
//    
        
        
        
	    
	}

}
