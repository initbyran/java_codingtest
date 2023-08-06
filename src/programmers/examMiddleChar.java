package exam;

public class examMiddleChar {

	public static void main(String[] args) {
		
		String s = "abcde";
		char[] ch = s.toCharArray();
		
		String answer = "";
		if(s.length()%2==0) {
			answer = ch[(s.length()/2)-1] +""+ ch[(s.length()/2)];
		} else {
			answer = Character.toString(ch[(s.length()/2)]);
		}
		

		System.out.println(answer);
	}

}
