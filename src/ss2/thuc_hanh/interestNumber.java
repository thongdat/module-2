package ss2.thuc_hanh;

import java.util.Scanner;

public class interestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang");
        int month = sc.nextInt();
        System.out.println("Nhap so tien");
        double money = sc.nextDouble();
        System.out.println("Nhap so lai suat hằng năm");
        float interestRate = sc.nextFloat();
        int totalInterest = 0;
        for (int i = 1; i <= month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Interest :" + totalInterest);
    }
}
