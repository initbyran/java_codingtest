package programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class examWeaponOfKnights {
    public static void main(String[] args) {

        int number = 5;
        int limit = 3;
        int power = 2;

        Set<Integer> numSet = new HashSet<>();
        for(int i=1; i<=number; i++){
           numSet.add(i);
        }
        int answer = 0;
        for(int j : numSet) {
            int count = 0;
            for (int i = 1; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    count += 2;
                }
            }
            if(Math.pow((int)Math.sqrt(j),2)==j){
                count --;
            }
            System.out.println(count);
            if(count>limit){
                answer += power;
            } else {
                answer += count;
            }
        }

        System.out.println(answer);
    }
}
