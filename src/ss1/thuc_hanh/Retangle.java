package ss1.thuc_hanh;

import java.util.Scanner;

public class Retangle {
    public static void main(String[] args) {
        float hight;
        float width;

        Scanner scanner = new Scanner(System.in);

        System.out.println("hight is");
        hight = scanner.nextFloat();

        System.out.println("width is");
        width = scanner.nextFloat();

        float area = hight * width;
        System.out.printf("Area: %.2f", area);

    }
}
