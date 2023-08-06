package programmers;

public class examTargetNum {

    static int answer = 0;
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        dfs(numbers, 0,0, target);
        System.out.println(answer);
    }

    static void dfs(int[] numbers,int index, int sum,  int target) {
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
        } else {
            dfs(numbers, index + 1, sum + numbers[index], target);
            dfs(numbers, index + 1, sum - numbers[index], target);

        }
    }

}
