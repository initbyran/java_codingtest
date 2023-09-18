package exam;

public class examHidePhoneNum {

	public static void main(String[] args) {
		
		String phone_number ="01033334444";
		String answer = phone_number.substring(phone_number.length() -4);
		for(int i=0; i<phone_number.length()-4; i++){
			answer = "*"+answer;
		}

		System.out.println(answer);

	}

}
