package exam;

import java.util.Arrays;
import java.util.HashSet;

public class examChooseTwoNum {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5};
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<(numbers.length-1); i++) {
			for(int j=i+1; j<numbers.length; j++) {
				int m = numbers[i]+numbers[j];
				set.add(m);
			}
		}

		int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
       
		for(int i=0; i<answer.length;i++) {
		System.out.print(answer[i]);		
        }

	}

}
