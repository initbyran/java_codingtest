package programmers;

public class examXdistanceNnum {

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        long[] answer = new long[n];
        answer[0]=x;
        for(int i=1; i<n; i++){
            answer[i] = x + answer[i-1];
        }

        System.out.println(answer);
    }
}
