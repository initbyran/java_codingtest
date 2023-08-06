package exam;

import java.util.ArrayList;
import java.util.List;

public class examMockTest {

	public static void main(String[] args) {
		
			int[] answers = {1,3,2,4,2};
	        int[] student1 = {1,2,3,4,5};
		    int[] student2 = {2,1,2,3,2,4,2,5};
		    int[] student3 = {3,3,1,1,2,2,4,4,5,5};

		    int questions = answers.length;
		    
		    int[] count = new int[3];
		    for(int i=0; i<questions; i++) {
		    	if(answers[i] == student1[(i%(student1.length))]) {
		    		count[0] ++;
		    	}
		    	
		    	if(answers[i] == student2[(i%(student2.length))]) {
		    		count[1] ++;
		    	}
		    	
		    	if(answers[i] == student3[(i%(student3.length))]) {
		    		count[2] ++;
		    	}
		    }

		    List<Integer> list = new ArrayList<>();
		    int max = Math.max(Math.max(count[0],count[1]), count[2]);
		    if(max!=0 && max == count[0]) {
		    	list.add(1);
		    } 
		    if (max!=0 && max == count[1]) {
		    	list.add(2);
		    } 
		    if (max!=0 && max == count[2]) {
		    	list.add(3);
		    } 
		    
		    int min = Math.min(Math.min(count[0], count[1]), count[2]);
		    if(max!=min && min!=0 && min == count[0]) {
		        list.add(1);
		    } 
		    if (max!=min && min!=0 && min == count[1]) {
		    	list.add(2);
		    }
		    if (max!=min && min!=0 && min == count[2]) {
		    	list.add(3);
		    } 
		    
		    if(min!=count[0] && max!=count[0]) {
		    	list.add(1);
		    } else if(min!=count[1] && max!=count[1]) {
		    	list.add(2);
		    } else if(min!=count[2] && max!=count[2]) {
		    	list.add(3);
		    }
		    
		    	    
		    int s = list.size();
		    int[] answer = new int[s];
		    for(int i=0; i<s; i++) {
		    	answer[i] = list.get(i);
		    	System.out.println(answer[i]);
		    }
		    

	}

}
