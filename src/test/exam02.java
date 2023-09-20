package test;

public class exam02 {
    public static void main(String[] args) {

        int n = 3;


        int smallSizeSum = (n*(n-1)*((2*n)-1))/6;
        int rhombusSum = 2*smallSizeSum - 2*((int)Math.pow(n-1, 2)) - 2*((int)Math.pow(n-2, 2));
        int k = n/2;
        int bigSizeSum =0;
        for(int i=1; i<= n/2; i++){
            bigSizeSum += Math.pow((n-(2*i)),2);
        }
        int answer = smallSizeSum + rhombusSum + bigSizeSum;


        System.out.println(answer);
    }
}
