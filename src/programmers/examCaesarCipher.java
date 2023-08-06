package programmers;

public class examCaesarCipher {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;

        char[] arr = s.toCharArray();
        String answer = "";

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=' ') {
                int ascii = (int) arr[i];
                if ((ascii >= 65 && ascii <= 90)) {
                    ascii = (int) arr[i] + n;
                    if (ascii > 90) {
                        ascii -= 26;
                    }
                } else if ((ascii >= 97 && ascii <= 122)) {
                    ascii = (int) arr[i] + n;
                    if (ascii > 122) {
                        ascii -= 26;
                    }
                }
                arr[i]=(char) ascii;
            }
            answer+=arr[i];
        }



        System.out.println(answer);
    }
}
