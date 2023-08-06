package programmers;

public class examFindingPrimeNumLevel01 {

    public static void main(String[] args) {
        int n = 5;

        int answer = 0;

        for(int i=0; i<=n; i++){
            if(isPrime(i)){
                answer++;
            }
        }

        System.out.println(answer);
    }

    static boolean isPrime(int n){
       if(n==0 || n==1) return false;
        for(int j=2; j*j<=n; j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}
