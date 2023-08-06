package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exam1157 {

   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String strUpper = str.toUpperCase();
       
       String str2 = "";
       for(int i=0; i<strUpper.length(); i++) {
    	   if(strUpper.indexOf(strUpper.charAt(i))==i) {
    		   str2 += strUpper.charAt(i);
    	   }
       }
       
       Map<Character, Integer> map = new HashMap<Character, Integer>();
   
       for(int i=0; i<str2.length(); i++) {
    	  int count = 0;
          char ch = str2.charAt(i);
          for(int j=0; j<strUpper.length(); j++) {
        	 
             if(ch == strUpper.charAt(j)) {
                count ++;
             }
          }
          map.put(ch,count);
       };
       
       Map.Entry<Character, Integer> maxEntry = null;
       for (Map.Entry<Character, Integer> entry : map.entrySet()) {
          if(maxEntry == null || entry.getValue()> maxEntry.getValue()) {
             maxEntry = entry;
          }
          char key = maxEntry.getKey();
          int value =maxEntry.getValue();
       };
       
       int max = maxEntry.getValue();
       char maxCha = maxEntry.getKey();
       
       int sameCount = 0 ;
       
       for (Character key : map.keySet()) {
       
          Integer value = map.get(key);
           
            if (value == max ) {
               sameCount = sameCount + 1;
             }
       };
       
       if (sameCount == 1) {
          System.out.println(maxCha);
       } else {
           System.out.println("?");
       }

   }

}