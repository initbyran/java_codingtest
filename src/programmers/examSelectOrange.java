package programmers;

import java.util.*;

public class examSelectOrange {


    public static void main(String[] args) {
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        // 1. counting
        Map<Integer, Integer> countingMap = new HashMap<>();

        for(int size : tangerine) {
            countingMap.put(size, countingMap.getOrDefault(size, 0) + 1);
        }

        // 2. order
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(countingMap.values());


        int sum = 0;
        int answer = 0;

        while(!queue.isEmpty()) {
            sum += queue.poll();
            answer++;
            if(sum >= k) {
                break;
            }
        }



        System.out.println(answer);
    }



}
