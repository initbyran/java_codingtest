package programmers;

import java.util.Arrays;

public class examMatrix {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        // answer행렬의 크기 : arr1.length() * arr2[0].lenth()
        int num1 = arr1.length;
        int num2 = arr2[0].length;
        int num3 = arr2.length;

        int[][] answer = new int[num1][num2];
        for(int i=0; i<num1; i++){
            for(int j=0; j<num2; j++){
                int sum = 0;
                for(int k=0; k<num3; k++){
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }


        for(int i=0 ; i< answer.length; i++ ){
            for(int j=0 ; j<answer[i].length; j++){
                System.out.println(answer[i][j]);
            }
        }
    }
}
