package ss2.thuc_hanh;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
       do {
            System.out.println("1. hình tam giác");
            System.out.println("2. hình chữu nhật");
            System.out.println("3. hình vuông ");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("hình tam giác");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("hình chữ nhật");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("hình vuông");
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    System.out.println("****");
                    break;
                    default:
                        System.out.println("Nhập sai vui lòng nập lại từ (1-4)");
            }
        }while (choice != 4);
    }
}
