package exam;

public class examKimSoebang {

	public static void main(String[] args) {
		
		String[] seoul = {"Jane", "Kim"};
		String num = "";
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")){
				num = String.valueOf(i);
			}
		}

		String answer = "김서방은 "+num+"에 있다";
	}

}
