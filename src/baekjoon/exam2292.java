package exam;

import java.util.Scanner;

public class exam2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int line = 0;
		int m=3;
		
		while(true) {
			if(((num-1)/3)>((m-2)*(m-1)) && ((num-1)/3)<((m-1)*m)) {
				line = m;
				break;
			} else {
				m = m+1;
			}
		}
		
		System.out.println(line);
	}

}
