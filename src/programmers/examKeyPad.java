package exam;

public class examKeyPad {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		
		String right ="R";
	    String left ="L";
	    
		if(hand.equals("right")) {
			hand = right;
		} else {
			hand = left;
		}
		
		//최소 거리에 대한 값을 들어오는 num에 따라 갱신해주는 방법 생각해볼것
	
		int[][] location = {{1,0},{0,3},{1,3},{2,3},{0,2},{1,2},{2,2},{0,1},{1,1},{2,1},{0,0},{2,0}};		
	    
	    String answer = "";
	    
	    
	    int lLocation = 10;
	    int rLocation = 11;
	    
		    
	    for(int i=0; i<numbers.length; i++) {
	    	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7 ) {
		    	answer = answer+left;
		    	lLocation = numbers[i];	    	
		    } else if(numbers[i]==3 ||numbers[i]==6 || numbers[i]==9) {
		    	answer = answer+right;
		    	rLocation = numbers[i];
		    } else {
		    	int goal = numbers[i];
		    	int lDistance = Math.abs(location[goal][0]-location[lLocation][0])+Math.abs(location[goal][1]-location[lLocation][1]);
		    	int rDistance = Math.abs(location[goal][0]-location[rLocation][0])+Math.abs(location[goal][1]-location[rLocation][1]);
		        if(lDistance == rDistance) {
		        	if(hand.equals(left)) {
		        		answer = answer+left;
		        		lLocation = numbers[i];	
		        	} else {
		        		answer = answer+right;
		        		rLocation = numbers[i];
		        	}
		        } else if(lDistance > rDistance) {
		        	answer = answer+left;
		        	lLocation = numbers[i];	
		        } else {
		        	answer = answer+right;
		        	rLocation = numbers[i];
		        }
		        
		    	
		        
		    }
	    	
	    }
	    
	    System.out.println(answer);
	}
	

}
