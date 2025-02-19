package ss4.thuc_hanh;

import java.util.Scanner;

public class REctangle {
    double width;
    double height;

    public REctangle() {}
    public REctangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = sc.nextDouble();
        REctangle rect = new REctangle(width, height);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
    }
}
