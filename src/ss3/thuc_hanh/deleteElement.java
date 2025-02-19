package ss3.thuc_hanh;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        int n = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.println("New array is: ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
