package exam;

import java.util.Arrays;

public class examHIndex {

	public static void main(String[] args) {
		
		int[] citations = {1, 4,4,4,4,4};
		Arrays.sort(citations);
		
		int n = citations.length;
		int answer = 0;
		
		if(citations[0]==citations[n-1]) {
			if(citations[0]<n) {
				answer = citations[0];
			} else {
				answer = n;
			}
		} else {
			for(int k=n; k>0; k--) {
				if(citations[k-1]>(n-k)) {
					answer = n-k+1;
				} else if(citations[k-1]==(n-k)) {
					answer = n-k;
				}
			}
		}
		System.out.println(answer);
		
	}

}
