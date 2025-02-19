package ss3.bai_tap;

import java.util.Scanner;

public class countChar {
    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Ho Van Thong Dat";
        System.out.println("Nhập vao một kí tự");
        char s = sc.nextLine().charAt(0);
        if (countChar(str, s) == 0) {
            System.out.println("Không có ký tự nào !");
        }else {
            System.out.println("Ký tự "+ s +" lặp lại " + countChar(str, s) + " lần");
        }
    }
}
