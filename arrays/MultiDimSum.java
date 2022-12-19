package session.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int row = 3;
        int col = 4;
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                arr[i][j]=in.nextInt();
            }
        }

        for (int j = 0; j < col; j++){
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += arr[i][j];
            }
            System.out.print(sum+" ");
        }

    }
}
