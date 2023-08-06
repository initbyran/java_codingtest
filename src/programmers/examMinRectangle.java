package exam;

import java.util.Arrays;

public class examMinRectangle {

	public static void main(String[] args) {
		
		int[][] sizes = {{0, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		
		int[] a = new int[sizes.length];
		int[] b = new int[sizes.length];
		
		for(int i=0; i<sizes.length; i++) {
			if(sizes[i][0]>=sizes[i][1]) {
				a[i] = sizes[i][1];
				b[i] = sizes[i][0];	
			} else {
				a[i] = sizes[i][0];
				b[i] = sizes[i][1];	
			}
		}

		Arrays.sort(a);
		Arrays.sort(b);
		
		int answer = a[sizes.length-1]*b[sizes.length-1];
		System.out.println(answer);
		
	}

}
