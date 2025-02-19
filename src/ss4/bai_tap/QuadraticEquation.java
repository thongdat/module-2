package ss4.bai_tap;


import java.util.Scanner;

public class QuadraticEquation {
    int a, b, c;

    public QuadraticEquation(){}
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){

        return Math.pow(b , 2) - 4 * a * c;
    }
    public double getRoot(){

        return -b / (2*a);
    }
    public double getRoot1(){
        return (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println("Phương trình này có dạng " + a + "x^2 + " + b + "x + " + c);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() > 0){
            System.out.println("phương trình có 2 nghiệm là: " + qe.getRoot1() + "," + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("phương trình chỉ có duy nhát 1 nghiệm " + qe.getRoot());

        }else {
            System.out.println("Phương trình k có nghiệm nào");
        }
    }
}
