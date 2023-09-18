package programmers;

public class examFlipTernary {
    public static void main(String[] args) {
        int n = 45;
        String ternary = "";
        while(n >= 3){
            ternary += Integer.toString(n%3);
            n = n/3;
        }

        String flippedNum = ternary + Integer.toString(n);
        int answer = 0;
        for (int i=0; i<flippedNum.length(); i++){
            answer = answer + ((Character.getNumericValue(flippedNum.charAt(i)))*(int)(Math.pow(3,flippedNum.length()-i-1)));
        }

        System.out.println(answer);
    }
}
