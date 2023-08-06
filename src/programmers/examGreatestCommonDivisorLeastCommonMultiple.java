package programmers;

public class examGreatestCommonDivisorLeastCommonMultiple {

    public static void main(String[] args) {
        int n = 3;
        int m = 12;

        int[] answer = new int[2];

        answer[0] = 0;

        for(int i=1; i<=Math.min(n,m); i++){
            if(n%i==0 && m%i==0 && answer[0]<i){
                answer[0]=i;
            }
        }
        answer[1]= (n/answer[0])*(m/answer[0])*answer[0];

        for(int i: answer) {
            System.out.println(i);
        }
    }
}
