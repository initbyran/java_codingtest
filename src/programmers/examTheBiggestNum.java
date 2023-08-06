package programmers;

import java.util.*;

public class examTheBiggestNum {
    public static void main(String[] args) {
        int[] numbers = {10,20,22};

        String[] numToStr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            numToStr[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(numToStr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        String answer = "";
        if(numToStr[0].equals("0")) {
            answer = "0";
        } else {
            answer = String.join("", numToStr);
        }
        System.out.println(answer);
    }
}
