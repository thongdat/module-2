package ss3.bai_tap;

import java.util.Scanner;

public class studentPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] array;
        do{
            System.out.println("Enter the size of the array");
            size = sc.nextInt();
        }while (size <= 0);
        array = new int[size];
        int i = 0;
        while( i < array.length){
            System.out.println("Enter the "+(i+1)+"th student");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List điểm");
        for(i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
            if (array[i] > 5 && array[i] < 10){
                count++;
            }
        }
        System.out.printf("số học sinh pass là %d", count);
    }
}
