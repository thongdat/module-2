package ss3.bai_tap;

import java.util.Scanner;

public class calculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int rows = sc.nextInt();
        System.out.println("Nhập số cột");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("nhập số hàng " + i + " " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập vào số cột mà bạn muốn tính tổng ");
        int col = sc.nextInt();
        if (col >= 0 && col < cols) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                    sum += matrix[i][col];
                }
            System.out.println("Tổng số phần tử của cột " + col +" là " + sum);
            }else {
            System.out.println("không hoợp lệ");
        }

        }
    }

