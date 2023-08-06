package exam;

import java.util.Scanner;

public class exam2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		String num2 = sc.next();

		String num1Sg = "";
		for(int i=num1.length()-1; i>=0; i--) {
	        num1Sg += num1.charAt(i);   
		};
		
		String num2Sg = "";
		for(int i=num2.length()-1; i>=0; i--) {
	        num2Sg += num2.charAt(i);   
		};
		
		if( Integer.parseInt(num1Sg)>Integer.parseInt(num2Sg)) {
			System.out.println(num1Sg);
		} else {
			System.out.println(num2Sg);
		}
		
		
	}

}
