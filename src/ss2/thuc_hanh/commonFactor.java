package ss2.thuc_hanh;

import java.util.Scanner;

public class commonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("không có ước chung lớn nhất");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("highest common factor" + a);
        }
    }
}
