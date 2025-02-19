package ss5.thuc_hanh;

public class Car {
    private String engine;
    private String name;
    private static int numberOfCar;
    public Car() {}
    public Car(String engine, String name) {
        this.engine = engine;
        this.name = name;
        numberOfCar++;
    }
    public static void main(String[] args) {
        Car car1 = new Car("13", "car");
        System.out.println(car1.numberOfCar);
        Car car2 = new Car("14", "car");
        System.out.println(car2.numberOfCar);

    }
}
