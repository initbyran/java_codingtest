package test;

public class exam01 {
    public static void main(String[] args) {
        String[] a = {"abab", "bbaa", "bababa", "bbbabababbbaa"};

        String[] result = new String[a.length];
        for(int i=0; i<a.length; i++){
            while(a[i].length()>2) {
                if (a[i].charAt(0) == 'b' && a[i].charAt(a[i].length() - 1) == 'b') {
                    a[i] = a[i].substring(1,a[i].length()-1);
                } else if(a[i].charAt(0) == 'a'){
                    a[i] = a[i].substring(1,a[i].length());
                } else if(a[i].charAt(a[i].length()-1)=='a'){
                    a[i] = a[i].substring(0,a[i].length()-1);
                }
            }
            result[i] = a[i];
        }

        boolean[] answer = new boolean[a.length];
        for(int i=0; i<a.length; i++){
            if(a[i].equals("a")){
                answer[i] = true;
            } else {
                answer[i] = false;
            }
        }

        for (boolean b : answer) {
            System.out.println(b);
        }
    }
}