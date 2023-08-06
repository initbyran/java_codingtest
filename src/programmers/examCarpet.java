package exam;

public class examCarpet {

	public static void main(String[] args) {
		
		int brown = 12;
		int yellow = 3;
		
		int[] answer = new int[2];
		
		int sum = brown+yellow;
	
		for(int i=sum/3; i>=3; i--) {
			if(sum%i==0 && sum/i<=i && (i-2)*(sum/i-2)==yellow) {
				answer[0] =i ;
				answer[1] =sum/i;
			}
		}
	
		
		System.out.println(answer[0]+" x " +answer[1]);
	}

}
