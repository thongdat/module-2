package ss3.bai_tap;

import java.util.Scanner;

public class sum2Diagonals {
    public static int sum2Diagonals(int[][] arr) {
        int sum1 = 0;
        int sum2 = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }

        return sum1 + sum2;
    }
    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cạnh");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("Nhập vào gia trị dòng "+i+" cột "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void display2DArray(int [][] arr) {
        System.out.println("Mảng 2 chiều này có gia trị là");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr = input2DArray();
        display2DArray(arr);
        System.out.println("mảng này có tổng 2 đường chéo là " + sum2Diagonals(arr));
    }
}
