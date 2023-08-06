package programmers;

import java.util.HashSet;

public class examFindingPrimNumberLevel02 {

    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        String numbers = "17";

        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[numbers.length()];

        recursion(arr, visited,"", 0);

        int answer = set.size();
        System.out.println(answer);
    }

    static void recursion(char[] arr, boolean[] visited, String str, int index){
        int num = 0;
        if(!str.equals("")){
            num = Integer.parseInt(str);
            if(isPrime(num)){
                set.add(num);
            }
        }
        if(index==arr.length) return;
        for(int i=0; i<arr.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            recursion(arr, visited,str+arr[i],index+1 );
            visited[i] = false;
        }
    }

    static boolean isPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
