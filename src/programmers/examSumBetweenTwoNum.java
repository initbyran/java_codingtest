package exam;

public class examSumBetweenTwoNum {

	public static void main(String[] args) {
		
		int a =3;
		int b =5;
		long answer = 0;

		
		if (a > b) {
			for (int i = b; i <= a; i++) {
				answer = answer + i;
			}

		} else if (a < b) {

			for (int i = a; i <= b; i++) {
				answer = answer + i;
			}
		} else {
			answer = a;
		}
		
		System.out.println(answer);
	}
}
