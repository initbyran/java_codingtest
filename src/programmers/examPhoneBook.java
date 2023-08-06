package exam;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class examPhoneBook {

	public static void main(String[] args) {
		
		String[] phone_book = {"12","123","1235","567","88"};
		Set<String> set = new HashSet<>();
		
		for(String phoneNum : phone_book) {
			set.add(phoneNum);
		}
		
		 boolean answer = true;
		
	        	
		 for(String number : phone_book) {
				for(int i=0; i<number.length(); i++) {
					if(set.contains(number.substring(0, i))){			   
						answer = false;
						break;
					}	               
				}
				if(!answer) {
					break;
				}	
		 }          
	        
		
		System.out.println(answer);

		
	}

}
