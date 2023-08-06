package exam;

public class examMaxMin {

	public static void main(String[] args) {
		
		String s = "-1 -2 -3 -4";
		String[] split = s.split(" ");
		
		int max = -1000000000;
		int min = 1000000000;
		for(int i=0; i<split.length; i++) {
			int num = Integer.parseInt(split[i]);
			if(max<=num) {
				max = num;
			} 
			if(min>=num) {
				min = num ;
			}
			
	}
		String answer = String.valueOf(min) + " " + String.valueOf(max);

		System.out.println(answer);
}
}