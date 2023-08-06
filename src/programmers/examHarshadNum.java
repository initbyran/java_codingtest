package exam;

public class examHarshadNum {

	public static void main(String[] args) {
		
		int x = 13;
		int sum = 0;
		int n = x;
		while(n!=0) {
			int remainder = n%10;
			n = n/10;
			sum += remainder;
		}

		boolean answer = true;
		
		if(x%sum!=0) {
			
			answer = false; 
		}
		
				
		
		System.out.println(answer);
		
	}

}
