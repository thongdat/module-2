package ss3.thuc_hanh;

import java.util.Scanner;

public class foundStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                found = true;
                System.out.println(students[i] + " is found");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
}
