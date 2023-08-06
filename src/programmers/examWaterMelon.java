package exam;

public class examWaterMelon {

	public static void main(String[] args) {
		
		int n = 3;
		
		String answer = "";
		
		for(int i=0; i<n/2; i++) {
			answer+="수박";
		}
		
		if(n%2!=0) {
		    answer+="수";	
		}
	
		System.out.println(answer);
	}

}
