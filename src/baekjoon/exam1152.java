package exam;

import java.util.Scanner;

public class exam1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str2 = str.trim();
		
		if(str2 == "") {
		  System.out.println("0");	
		
		}else {
		  String[] array = str2.split (" ");
		  System.out.println(array.length);
			
			}
	}
}
