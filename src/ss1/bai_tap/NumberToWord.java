package ss1.bai_tap;

import java.util.Scanner;

public class NumberToWord {
    private static final String[] belowTwenty = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (0-999): ");
        int number = sc.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Invalid number");
        } else {
            System.out.println(numberToWord(number));
        }
    }

    public static String numberToWord(int number) {
        if (number < 20) {
            return belowTwenty[number];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + belowTwenty[number % 10] : "");
        } else {
            return belowTwenty[number / 100] + " hundred " + (number % 100 != 0 ? " and " + numberToWord(number % 100) : "");
        }
    }
}
