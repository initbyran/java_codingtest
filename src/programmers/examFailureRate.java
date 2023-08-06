package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class examFailureRate {

   public static void main(String[] args) {
      
      int N = 5;
      int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
      
      Arrays.sort(stages);
      int max = stages[stages.length-1]-1;
      
      List<Integer> list = new ArrayList<>();
      
      for(int i=1; i<=max; i++) {
         int count = 0;
         for(int j=0; j<stages.length; j++) {
            if(i==stages[j]) {
               count++;         
            }
            
         }
         list.add(count);
      }
      
      Float[] rate = new Float[max];
      
      rate[0]= (float)list.get(0)/stages.length;
      
      for(int i=1; i<list.size(); i++) {
         int sum = 0;
         for(int j=0; j<i; j++) {
            sum += list.get(j);
         }
         float r = (float)list.get(i)/(stages.length-sum);
         rate[i] = r;
      }
      
      Map<Integer, Float> map = new HashMap<>();
      
      for(int i=1; i<=rate.length; i++) {
         map.put(i, rate[i-1]);
      }
      
      List<Map.Entry<Integer, Float>> entries = new ArrayList<Map.Entry<Integer, Float>>(map.entrySet());
      Collections.sort(entries, new Comparator<Map.Entry<Integer, Float>>(){
      
    	  public int compare(Map.Entry<Integer, Float> e1, Map.Entry<Integer, Float>e2){
    	  	return e2.getValue().compareTo(e1.getValue());
      }
      }    	  
    	  );
//      
//      for(Map.Entry<Integer, Float> entry: entries) {
//    	
//    	  int[] answer = {entry.getKey()};
//    	  for(int i=0; i<answer.length; i++) {
//    		  System.out.println(answer[i]);
//    	  }
//      }
//     
   
      int[] answer = new int[entries.size()];
      for(int i=0; i<entries.size(); i++) {
    	 answer[i] = entries.get(i).getKey();
      }
      for(int i=0; i<answer.length; i++) {
		  System.out.println(answer[i]);
	  }
       
   
   }

}


