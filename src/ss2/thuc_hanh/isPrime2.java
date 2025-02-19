package ss2.thuc_hanh;

public class isPrime2 {
    public static void main(String[] args) {
        int k;
        int f1 = 0;
        System.out.println(f1);
        int f2 = 1;
        System.out.println(f2);
        for (int i = 0; i < 20; i++) {
            k = f1 + f2;
            if (k >= 100) {
                break;
            }
            f1 = f2;
            f2 = k;
            System.out.println(k);
        }
    }
}
