package ss3.thuc_hanh;
 import java.util.Scanner;
public class swapArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter the size of the array");
            size = sc.nextInt();

        } while (size <= 0);
        array = new int[size];
        int i = 0;
        while(i < size){
            System.out.println("enter the element " + (i + 1));
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("First array is: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        for (int k = 0; k < array.length/2; k++){
            int temp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = temp;
        }
        System.out.print("\nfinal array is: ");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
    }
}
