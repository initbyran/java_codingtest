package exam;

public class examFibonacci {

	public static void main(String[] args) {
		
		int n = 16;
		
		int a = 0;
		int b = 1;
	    
		int fbnc = 0;
		for(int i=0; i<n/2; i++) {
			 a = (a%1234567 + b%1234567);
			 System.out.println("a : "+a );
			 b = (a%1234567 + b%1234567);
			 System.out.println( "b : "+ b);
		   if(n%2==0) {
			   fbnc = a;
		   } else {
			   fbnc = b;
		   }
		}
		
		int answer = fbnc%1234567;
		
		System.out.println(answer);

	}

}
