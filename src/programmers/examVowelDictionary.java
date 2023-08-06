package programmers;

public class examVowelDictionary {

    static int cnt = 0;
    static int answer = 0;
    static boolean isStop = false;
    public static void main(String[] args) {
        String word = "AAAE";

        // A, E, I, O, U
        String[] arr = {"A", "E", "I", "O", "U"};
        find(arr, 0, word, "");
        System.out.println(answer);
    }

    static void find(String[] arr, int depth, String word, String str) {
            if (depth == 6) {
                return;
            }
            if (str.equals(word)) {
                answer = cnt;
                isStop = true;
                return;
            }
        for (int i = 0; i < arr.length; i++) {
            if(isStop){
                return;
            } else if(depth<5) {
                cnt++;
                find(arr, depth + 1, word, str + arr[i]);
            }
        }

    }
}