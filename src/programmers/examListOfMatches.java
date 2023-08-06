package exam;

public class examListOfMatches {

	public static void main(String[] args) {
		
		int n = 8;
		int a = 4;
		int b = 7;
		
		int answer = 0;
		while(a != b) {
			a = a%2 + a/2;
			b = b%2 + b/2;
			answer ++;
		}
		System.out.println(answer);

	}

}
