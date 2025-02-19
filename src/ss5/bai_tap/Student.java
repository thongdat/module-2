package ss5.bai_tap;

public class Student {
    private String name = "john";
    private String classes ="Co2";
    public Student() {}
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dat", "co1");
        Student s2 = new Student("John", "co2");
        System.out.println(s1.getName() + " " + s1.getClasses());
        System.out.println(s2.getName() + " " + s2.getClasses());
    }
}
