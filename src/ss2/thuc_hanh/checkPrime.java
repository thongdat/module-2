package ss2.thuc_hanh;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " not a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " prime number");
            } else {
                System.out.println(n + " not a prime number");
            }
        }

    }
}
