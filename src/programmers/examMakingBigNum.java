package programmers;

public class examMakingBigNum {

    public static void main(String[] args) {
        String number = "4177252841";
        int k = 4;

        char[] arr = number.toCharArray();

        int ansLength = number.length() - k;
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ansLength; i++) {
            char max = '0';
            for (int j = index; j <= k + i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j + 1;
                }
            }
            stringBuilder.append(Character.toString(max));
        }

        String answer = stringBuilder.toString();
        System.out.println(answer);
    }
}
