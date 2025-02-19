package ss5.bai_tap;

public class Radius {
    private double radius;
    private String color;

    public Radius() {}
    public Radius(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea(double radius) {
        return Math.PI *radius * radius;
    }

    public static void main(String[] args) {
        Radius r = new Radius();
        r.setRadius(1.0);

        System.out.println(r.getArea(1.0));
        Radius r2 = new Radius(5,"Black");
        System.out.println(r2.getRadius());
        System.out.println(r2.getArea(r2.getRadius()));
        System.out.println(r2.getColor());


    }
}
