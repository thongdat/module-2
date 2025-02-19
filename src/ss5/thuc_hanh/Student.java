package ss5.thuc_hanh;

public class Student {
    private String name;
    private int age;
    private static String college;

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static void setCollege() {
        college = "Codegym";
    }
    public void display() {
        System.out.println(name + " " + age + " " + college);
    }

    public static void main(String[] args) {
        Student.setCollege();
        Student s1 = new Student("Dat",18);
        s1.display();


    }
}
