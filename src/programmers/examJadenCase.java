package exam;

public class examJadenCase {

	public static void main(String[] args) {
		
		String s = " 3people   unFollowed me and I was 5 Sad ";
		
		String[] split = s.split(" ");
		String answer = "";
		for(int i=0; i<split.length; i++) {
			String word = split[i];
			if(word.length()==0) {
				answer+=" ";
			} else {
			answer += word.substring(0,1).toUpperCase();
			answer += word.substring(1,word.length()).toLowerCase();
			answer += " ";
		}
		}
		answer = answer.substring(0,answer.length()-1);
		 if(s.substring(s.length()-1,s.length()).equals(" ")) {
			 answer = answer + " ";
		 } 

		 if(s.substring(0, 1).equals(" ")){
			 answer = " " + answer;
		 }
		System.out.println("#"+answer+"#");
	}

}
