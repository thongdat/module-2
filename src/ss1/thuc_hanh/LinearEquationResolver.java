package ss1.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("ax + b = c ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter b number: ");
        int b = scanner.nextInt();
        System.out.println("Enter c number: ");
        int c = scanner.nextInt();

        if (a != 0){
            double x = (c - b) / a;
            System.out.println("The equation has a solution" + x);
        }else {
            if (b == c ){
                System.out.println("The solution is all x");
            }else{
                System.out.println("No solution");
            }
        }

    }
}
