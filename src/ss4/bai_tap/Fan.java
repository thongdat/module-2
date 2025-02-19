package ss4.bai_tap;

public class Fan {
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;

    private int speed;
    private double radius;
    private boolean on;
    private String color;
    public Fan() {
        this.speed = slow;
        this.radius = 5;
        this.on = false;
        this.color = "blue";
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        if(this.on){
            return "Fan is on, Speed" + speed + ", Radius: " + radius + ", Color: " + color;
        }else {
            return "Fan is off, Radius: " + radius + ", Color: " + color;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fast);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("blue");
        Fan fan2 = new Fan();
        fan2.setSpeed(medium);
        fan2.setRadius(5);
        fan2.setOn(true);
        fan2.setColor("red");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
