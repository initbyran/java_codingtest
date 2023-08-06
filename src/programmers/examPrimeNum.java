package exam;

import java.util.ArrayList;
import java.util.List;

public class examPrimeNum {

	public static void main(String[] args) {
		
		int[] nums = {1,2,7,6,4};

		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					int testNum = nums[i]+nums[j]+nums[k];
				    list.add(testNum);
				}
			}
		}
		
		List<Integer> nList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			int num = list.get(i);
			for(int j=2; j<=(int)Math.sqrt(num); j++) {
				if(num%j==0) {
					nList.add(num);
				}
			}
		}
		list.removeAll(nList);
		answer = list.size();
		System.out.println(answer);
		
		
	}

}
