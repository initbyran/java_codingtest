package exam;

public class examBinaryConversion {

	public static void main(String[] args) {
		
		String s = "110010101001";
		int[] answer = new int[2];
		String noOne = s.replaceAll("0", "");
		answer[1] = s.length()-noOne.length();
		
		while(s.length()!=1) {
			
		
			// 이진변환
			String oneOrZero = "";
			int num = noOne.length();
			
			for(int i=num; i>0; i/=2) {
				int n = i%2;
				oneOrZero = String.valueOf(n)+oneOrZero;
			}
			
			s = oneOrZero;
			
			answer[0]++;
			
			// 0제거
			noOne = s.replaceAll("0", "");
			answer[1] += s.length()-noOne.length();
			
			
			
		}
		
		
		System.out.println(answer[0]+ " , "+answer[1]);
	}
}
