package programmers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class examGymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {1,2,4};
        int[] reserve = {1,3,5};

        int answer = 0;
        Set<Integer> lostSet = new HashSet<>();
        for(int i : lost){
            lostSet.add(i);
        }
        Set<Integer> reserveSet = new HashSet<>();

        for(int i : reserve){
            if(!lostSet.contains(i)){
                reserveSet.add(i);
            } else {
                lostSet.remove(i);
            }
        }

        Iterator<Integer> it = lostSet.iterator();
        while(it.hasNext()){
            int i = it.next();
            if(reserveSet.contains(i-1)) {
                it.remove();
                reserveSet.remove(i-1);
            } else if(reserveSet.contains(i+1)){
                it.remove();
                reserveSet.remove(i+1);
            }
        }

        answer = n-lostSet.size();

        System.out.println(answer);
    }
}
