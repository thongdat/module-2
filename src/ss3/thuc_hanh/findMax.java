package ss3.thuc_hanh;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.print("Enter the size of array : ");
            size = sc.nextInt();

        } while (size <= 0);
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the elements" + (i + 1) + " in array : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("First array is: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");

        }
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("\nMaximum element is " + max);
    }
}
