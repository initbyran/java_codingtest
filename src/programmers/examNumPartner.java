package programmers;

import java.util.*;

public class examNumPartner {
    public static void main(String[] args) {

        String X = "5525";
        String Y = "1255";

        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for(int i=0; i<X.length(); i++){
            xCount[X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++){
            yCount[Y.charAt(i)-'0']++;
        }

        String answer = "";
        for(int i=9; i>=0; i--) {
            int count = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < count; j++) {
                answer += String.valueOf(i);
            }
        }

        if (answer.equals("")) {
            answer = "-1";
        } else if (answer.chars().allMatch(ch -> ch == '0')) {
            answer = "0";
        }

        System.out.println(answer);
    }
}
