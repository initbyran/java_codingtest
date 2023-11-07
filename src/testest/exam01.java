package testest;


public class exam01 {

    public static void main(String[] args) {
        int[] user_times = {20, 40, 65, 110};
        int T = 30;
        int answer =0;

        for( int time : user_times){
            int remain = T - (time%T);
            if(remain!= T){
                answer = Math.max(answer, remain);
            }
        }

        System.out.println(answer);
    }
}
