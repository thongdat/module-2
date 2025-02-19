package ss3.thuc_hanh;
import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int soMoi =10;
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = soMoi;

        System.out.println(Arrays.toString(newArray));
    }
}
