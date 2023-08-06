package exam;

public class examAverage {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int sum =0; 
		for(int i : arr) {
			sum+=i;
		}
		double answer = (double)sum/(double)arr.length;
		

	}

}
