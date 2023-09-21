package programmers;

import java.util.*;

/**
 * 시간초과!!!!!!
 */
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

        StringBuilder sb = new StringBuilder();
        for(int i=9; i>=0; i--) {
            int count = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < count; j++) {
                sb.append(String.valueOf(i));
            }
        }

        String answer = sb.toString();
        if (answer.equals("")) {
            answer = "-1";
        } else if (answer.chars().allMatch(ch -> ch == '0')) {
            answer = "0";
        }

        System.out.println(answer);
    }
}
