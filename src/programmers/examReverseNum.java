package exam;


public class examReverseNum {

	public static void main(String[] args) {
		
		long n = 987654321;
		
		int cipher = (int)Math.log10(n)+1;
		
		int[] answer = new int[cipher];
		for(int i=0; i<answer.length; i++) {
			if(n!=0) {
				answer[i] = (int) (n%10);
				n = n/10;
			}
		}
		
	}
	
	    

}
