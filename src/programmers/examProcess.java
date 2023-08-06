package programmers;

import javax.print.attribute.IntegerSyntax;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class examProcess {

    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        int answer = 0 ;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : priorities) {
            pq.offer(i);
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            q.add(i);
        }
        while (!pq.isEmpty()) {
            int num = q.peek();
            if(num==location && pq.peek()==priorities[num]) {
                System.out.println("___"+num);
                answer++;
                break;
            } else {
                  answer++;
                  pq.poll();
                  q.poll();
                System.out.println("###"+num);
                  q.add(num);
            }
        }


        System.out.println(answer);
    }
}
