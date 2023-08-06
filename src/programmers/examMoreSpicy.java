package programmers;

import java.util.PriorityQueue;

public class examMoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1,1,2,6};
        int k = 24;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }

        int answer = 0 ;
        while(pq.peek()<k && pq.size()>=2){
            int newScoville = pq.poll() + (pq.poll()*2);
            answer++;
            pq.offer(newScoville);
        }
        if(pq.peek()<k){
            answer = -1;
        }


        System.out.println(answer);
    }
}
