package programmers;

import java.util.Arrays;

public class examBudget {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        int cost = 0;
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            if(cost+d[i]<=budget) {
                cost = cost + d[i];
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}
