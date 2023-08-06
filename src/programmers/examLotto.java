package exam;

import java.util.ArrayList;
import java.util.List;

public class examLotto {

	public static void main(String[] args) {
		
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		int[] lottos = {45, 4, 35, 20, 3, 9};
	
		List<Integer> lottosList = new ArrayList<>();
		for(int i : lottos) {
			lottosList.add(i);
		}
		List<Integer> winNumsList = new ArrayList<>();
		for(int i : win_nums) {
			winNumsList.add(i);
		}
		
		lottosList.removeAll(winNumsList);
		winNumsList.removeAll(lottosList);
		
		int correct = 6-lottosList.size();  
		
		for(int i : lottosList) {
			if(i==0) {
				correct++;
			}
		}
		
		int maxRank = 1; 
		int minRank = 6;
		
		if(lottosList.size()==6 && correct==6) {
			maxRank = 1;
			minRank = 6;
		} else if(lottosList.size()==0 && correct==0) {
			maxRank = 1;
			minRank = 1;
		} else if(lottosList.size()==6 && correct==0) {
			maxRank = 6;
			minRank = 6;
		} else {
			maxRank = 7-correct; 
			minRank = 1+lottosList.size();
		}
		
		int[] answer = {maxRank, minRank};
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
