package exam;

import java.util.HashMap;
import java.util.Map;

public class examClothes {

	public static void main(String[] args) {
		 String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
	        int answer = 1;
	        Map<Integer, String> map = new HashMap<>();
	        for(int i=0; i<clothes.length; i++){
	            map.put(i, clothes[i][1]);
	        }
	        Map<String, Integer> countMap = new HashMap<>();
	        for(Map.Entry<Integer, String> entry : map.entrySet()){
	            int count = 0;
	            for(String str : map.values()){
	                if(str.equals(entry.getValue())){
	                    count++;
	                }
	            }
	            map.remove(entry.getKey(), entry.getValue());
	            countMap.put(entry.getValue(), count);
	        }

	        for(int count : countMap.values()){
	            answer = answer*count;
	        }

	        answer --;
	        System.out.println(answer);

	}

}
