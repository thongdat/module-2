package ss3.thuc_hanh;

import java.util.Scanner;

public class addTwoArray {
    public static void main(String[] args) {
        int[] arr = inputArray();
        System.out.println("First array is: ");
        printArray(arr);
        int[] arr1 = inputArray();
        System.out.println("Second array is: ");
        printArray(arr1);
        int[] arr2 = new int[arr1.length + arr.length];
        for (int k = 0; k < arr.length; k++) {
            arr2[k] = arr[k];
        }
        for (int k = 0; k < arr1.length; k++) {
            arr2[arr.length + k] = arr1[k];
        }
        System.out.println("third array is: ");
        printArray(arr2);

    }
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Enter array size: ");
            size = sc.nextInt();
        } while (size <= 0);
        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter array element" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
