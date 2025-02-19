package ss3.thuc_hanh;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        int[] newArray = new int[arr.length + 1];

        System.out.println("enter the number want to add");
        int n = sc.nextInt();
        System.out.println("address");
        int index = sc.nextInt();
        if (index < 0 || index > arr.length) {
            System.out.println("Can't add element");
        } else {
            for (int i = 0; i < arr.length; i++) {
                newArray[i] = arr[i];
            }
        }
        newArray[index] = n;


        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];

        }
        System.out.println("New array is: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
