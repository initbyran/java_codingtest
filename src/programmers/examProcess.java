package programmers;

import java.util.*;

public class examProcess {

    public static void main(String[] args) {

        int[] priorities = {2,1,3,2};
        int location = 2;

        Queue<Integer> index = new LinkedList<>();
        List<Integer> priority = new ArrayList<>();
        for(int i=0; i<priorities.length; i++){
            index.add(i);
            priority.add(priorities[i]);
        }

        Collections.sort(priority, Collections.reverseOrder());

        int cnt = 0;
        while(!index.isEmpty()){
            int i = index.poll();
            System.out.println("index= " + i);
            if(priorities[i]==priority.get(0)){
                System.out.println("priority : "+priority.get(0));
                priority.remove(0);
                cnt ++;
                if(i==location) break;
            } else {
                index.add(i);
            }
        }

        int answer = cnt;

        System.out.println(answer);
    }
}
