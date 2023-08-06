package programmers;

public class examFatigue {
    static int answer = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        visited = new boolean[dungeons.length];
        find(dungeons, 0, k);

        System.out.println(answer);
    }

    static void find(int[][] dungeons, int count, int k) {
        for(int i=0; i<dungeons.length; i++) {
            if (visited[i] || k < dungeons[i][0]) {
                continue;
            }
            visited[i] = true;
            find(dungeons, count + 1, k - dungeons[i][1]);
            visited[i] = false;
        }
        answer = Math.max(answer, count);
    }
}