package ss1.thuc_hanh;
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("month");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("year");
        int year = sc.nextInt();
        switch (month) {
            case 2:
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("January has 28");
                    break;
                }else{
                    System.out.println("February has 29");
                    break;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month " + month + " has 30 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
