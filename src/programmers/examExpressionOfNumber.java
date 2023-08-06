package exam;

public class examExpressionOfNumber {

	public static void main(String[] args) {
		
		int n = 15;
		
		int num = 2*n;
		int answer = 0;
		for(int i=1; i<=num; i++) {
			if(num%(i)==0 && i<(num/(i)) && ((num/i)-i-1)%2==0) {
				
				answer ++;
			}
		}
		
		System.out.println(answer);
		

	}

}
