package ss3.thuc_hanh;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int rows = sc.nextInt();
        System.out.println("nhập số cột");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhập sô hàng" + i + "số cột" + j);
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        int max = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tu lớn nhất của mảng này là:" + max);
    }
}
