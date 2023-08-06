package exam;

public class examBasicOfString {

	public static void main(String[] args) {
	
		String s = "1234";
		boolean answer = true;		
		if(s.length()== 4 || s.length()== 6) {
			for(int i=0; i<s.length(); i++) {
				if(!Character.isDigit(s.charAt(i))){
					answer = false;
				}
			}
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
