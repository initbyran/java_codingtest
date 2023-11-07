package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class exam03 {
    public static void main(String[] args) {

        String s = "centerminus";
        String[] word_dict = {"cent", "center", "term", "terminus", "rm", "min", "minus", "us"};
        Set<String> wordSet = new HashSet<>(Arrays.asList(word_dict));
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            int maxCount = 0;
            for(int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if(wordSet.contains(substr)) {
                    maxCount = Math.max(maxCount, 1 + dp[j]);
                }
            }
            dp[i] = maxCount;
        }

        int answer = dp[0];

        System.out.println(answer);
    }
}
