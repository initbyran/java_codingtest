package programmers;

public class examNetwork {

    static boolean[] checked;

    public static void main(String[] args) {

        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        checked = new boolean[n];
        for(int i=0; i<n; i++){
            checked[i] = false;
        }

        int answer = 0;
        for(int i=0; i<n; i++){
            if(!checked[i]){
                answer++;
                findNetwork(computers, i, checked);
            }
        }
        System.out.println(answer);
    }
    static void findNetwork(int[][] computers, int index, boolean[] checked){
        checked[index]=true;
        for(int i=0; i<computers.length; i++){
            if(checked[i]==false && computers[index][i]==1){
                findNetwork(computers, i, checked);
            }
        }
    }
}
