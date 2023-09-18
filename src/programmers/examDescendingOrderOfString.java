package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class examDescendingOrderOfString {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        List<Integer> ascii = new ArrayList<>();
        for( int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int asciiValue = (int) c;
            ascii.add(asciiValue);
        }

        Collections.sort(ascii, Collections.reverseOrder());
        String answer = "";
        for( int i : ascii ) {
            answer += (char) i;
        }

        System.out.println(answer);


    }
}
