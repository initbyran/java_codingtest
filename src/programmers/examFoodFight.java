package programmers;

import java.util.ArrayList;
import java.util.List;

public class examFoodFight {
    public static void main(String[] args) {

        int[] food = {1,3,4,6};

        String answer = "";
        String reverseAnswer = "";
        for(int i=0; i< food.length; i++){
            if(food[i]>1){
                for(int j=0; j<food[i]/2; j++){
                    answer = answer + String.valueOf(i);
                    reverseAnswer = String.valueOf(i)+reverseAnswer;
                }
            }
        }
        answer = answer + "0" + reverseAnswer;

        System.out.println(answer);

    }
}
