package hfdst16_javadocs.garage;

public abstract class Car {

    private final int NUMBER_OF_WHEELS = 4;
    private int count = 0;
   private String color = "White"; //word een object!
    private double speed = 0;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCount() {
        return count;
    }
}
