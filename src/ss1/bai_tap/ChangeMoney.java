package ss1.bai_tap;

import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd ;

        System.out.println("Nhập số tiền USD");
        usd = sc.nextDouble();
        double change = usd * 25000;
        System.out.println("Số tiền vừa quy đổi là:" + change);

        char x = 'x';
    }
}
