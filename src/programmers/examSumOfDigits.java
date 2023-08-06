package exam;

public class examSumOfDigits {

	public static void main(String[] args) {
		int N = 987;
		int answer = 0;    
	
		while(N != 0){
	
			int n = N%10;
			N = N/10;
	    	answer = answer + n;
	    }

	    System.out.println(answer);
}
}