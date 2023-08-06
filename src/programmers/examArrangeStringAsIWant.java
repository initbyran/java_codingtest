package programmers;

import java.util.*;

public class examArrangeStringAsIWant {

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;
        Arrays.sort(strings);
        HashSet<Character> set = new HashSet<>();
        for(String str : strings){
            set.add(str.charAt(n));

        }
        List<Character> list = new ArrayList<>();
        for(Character cha : set){
            list.add(cha);
        }
        Collections.sort(list);
        Queue<String> q = new LinkedList<>();
        for(int i=0; i< list.size(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(n) == list.get(i)){
                    q.add(strings[j]);
                }
            }
        }
        String[] answer = new String[strings.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = q.poll();
        }


        for(String str : answer){
            System.out.println(str);
        }
    }
}
