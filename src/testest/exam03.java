package testest;

import java.util.*;

public class exam03 {
    public static void main(String[] args) {
        int[] A = {1,10,2,9,3,8,4,7,5,6};
        int S = 20;

        int start = 0 ;

        List<Integer> possibleNum = new ArrayList<>();

        while(start<A.length) {
            int sum = 0;
            for (int i = start; i < A.length; i++) {
                sum += A[i];
                if (sum >= S) {
                    possibleNum.add(i-start+1);
                    break;
                }
            }

            start++;
        }

        int answer = -1;

        Collections.sort(possibleNum);
        answer = possibleNum.get(0);

        System.out.println(answer);
    }

}
