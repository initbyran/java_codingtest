package exam;

import java.util.HashMap;
import java.util.Map;

public class examPlayerNotFinish {

	public static void main(String[] args) {
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
//		List<String> pList = new ArrayList<>(Arrays.asList(participant)); 
//		List<String> cList = new ArrayList<>(Arrays.asList(completion)); 
//				
//		for(int i=0; i<cList.size(); i++ ) {
//			for(int j=0; j<pList.size(); j++) {
//				if((cList.get(i)).equals(pList.get(j))) {
//					pList.remove(j);
//					break;
//				}
//			}
//			
//		}
//			
//		String answer = pList.get(0);
		
		
		Map<String, Integer> pMap = new HashMap<>();
		
		for(String s: participant) {
			pMap.put(s, pMap.getOrDefault(s,0)+1);
			
		}
		
		for(String s: completion) {
			pMap.replace(s,pMap.get(s)-1);
		}
		
		String answer ="";
		for(String key : pMap.keySet()) {
			if(pMap.get(key)!=0) {
				answer = key;
			}
		}
		
		
		System.out.println(answer);
		
//		for(Map.Entry<String, Integer> entry : pMap.entrySet()) {
//			if(!Objects.equals(0, entry.getValue())) {
//				answer = entry.getKey();
//			}
//		}
		

	}

}

