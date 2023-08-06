package programmers;

public class examStrangeString {

    public static void main(String[] args) {

        String s = " try  hello world  ";

        s = s.toLowerCase();
        String[] arr = s.split("");
        int index = 0;
        String answer = "";
        for(int i=0; i<arr.length; i++) {
            if (arr[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                index++;
            } else if (index % 2 != 0) {
                index++;
            }
            answer += arr[i];
        }
        System.out.println(";"+answer+";");
    }
}
