package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class examTruckGoingThroughBridge {

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        int answer = 0;
        int w = 0;

        Queue<Integer> q = new LinkedList<>();
        for (int i : truck_weights) {
            q.add(i);
        }

        Queue<Integer> bridge = new LinkedList<>();
        while(!q.isEmpty()) {
            // 다리에 빈자리가 있고 무게 여유가 적당할때
            if (bridge.size() < bridge_length && q.peek() <= weight - w) {
                w = w + q.peek();
                answer++;
                bridge.add(q.poll());
            } else if (bridge.size() < bridge_length && q.peek() > weight - w) {
                // 다리에 빈자리가 있지만 무게 여유가 적당하지 않을때
                bridge.add(0);
                answer++;
            } else if (bridge.size() == bridge_length) {
                // 다리에 빈자리가 없을때
                w = w - bridge.poll();
                if (q.peek() <= weight - w) {
                    bridge.add(q.peek());
                    w = w + q.poll();
                } else {
                    bridge.add(0);
                }
                answer++;
            }
        }
       answer+=bridge_length;


        System.out.println(answer);
    }
}
