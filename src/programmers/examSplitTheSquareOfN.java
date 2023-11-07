package programmers;

public class examSplitTheSquareOfN {
    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;

        int count = (int)(right-left+1);
        int[] answer = new int[(int)(count)];

        // 첫 숫자 몇 번째 행인지 찾기
        long row = left/n;
        // 첫 숫자 몇 번째 열인지 찾기
        long column = (left%n)-1;

        // 해당 행의 숫자배열 : row수 만큼 row로 이루어진 후 1씩 커져 n까지
        if(column>row){

        }



    }
}
