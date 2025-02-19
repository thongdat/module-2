package ss1.thuc_hanh;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        int height;
        int width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the board: ");
        height = sc.nextInt();
        System.out.print("Enter the width of the board: ");
        width = sc.nextInt();
        int area = height * width;
        System.out.println("The area of the board is " + area);
    }
}
