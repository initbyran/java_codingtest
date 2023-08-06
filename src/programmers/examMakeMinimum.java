package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class examMakeMinimum {

	public static void main(String[] args) {

		int[] A = {1, 2};
		int[] B = {4, 3};
		
		Arrays.sort(A);
		Arrays.sort(B);
		List<Integer> bList = new ArrayList<>();
		for(int i=0; i<B.length; i++) {
			bList.add(B[i]);
		}
		
		int answer =0;
		Collections.reverse(bList);
		for(int i=0; i<A.length; i++) {
			int multiple = A[i]*bList.get(i);		
			answer += multiple;
		}

	 System.out.println(answer);
	}
}
