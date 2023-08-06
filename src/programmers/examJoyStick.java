package programmers;

import java.util.HashSet;

public class examJoyStick {
    // 오른쪽 먼저 -> A가 나타나면 인덱스 저장, 연속된 A개수가 지금까지 온 거리(인데스)보다 크다면 다시 왼쪽으로 돌아감
    // 오른쪽 먼저 -> 연속된 A개수가 지금까지 온 거리보다 작다면 그냥 계속 오른쪽으로 감
    public static void main(String[] args) {
        String name = "AAAA";

        int upDown = 0;
        for(int i=0; i<name.length(); i++) {
            int numChar = (int) name.charAt(i) - 65;
            upDown += Math.min(numChar, 26-numChar);
        }

        int leftRight = 0;

        char[] arr = name.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(char cha : arr){
            set.add(cha);
        }
        if(set.contains('A')) {
            int indexStart = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'A') {
                    indexStart = i;
                    break;
                }
            }
            for (int i = indexStart; i < name.length(); i++) {
                if(indexStart==0 && set.size()!=1) {
                    if(name.charAt(i) == 'A' && name.charAt(i+1) != 'A'){
                        leftRight = name.length()-i-1;
                        System.out.println("___"+leftRight);
                    }
                } else if (indexStart!=0 && name.charAt(i - 1) == 'A' && name.charAt(i) != 'A') {
                    if (indexStart > i - indexStart ) {
                        leftRight = name.length() - 1;
                        System.out.println("$$$ " + leftRight);
                    } else if (indexStart <= i-indexStart) {
                        leftRight = (indexStart * 2) - 1 + (name.length() - i- 1) ;
                        System.out.println("@@@ " + leftRight);
                    }
                    break;
                } else if(set.size()==1){
                    leftRight = 0;
                }
            }
        } else {
            leftRight = name.length()-1;
        }
        int answer = leftRight + upDown;
        System.out.println(answer);
    }
}
