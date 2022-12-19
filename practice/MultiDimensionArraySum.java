package session.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and Column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Sum of array is "+ arraySum(row,col));

    }
    static int arraySum(int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];
        System.out.println("Enter the Values: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
