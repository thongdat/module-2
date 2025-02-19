package ss2.thuc_hanh;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int k = 0;
        int f1 = 0;
        System.out.println(f1);
        int f2 = 1;
        System.out.println(f2);
        for (int i = 0; i < 20; i++) {
            k = f1 + f2;
            f1 = f2;
            f2 = k;
            System.out.println(k);
        }
    }
}
