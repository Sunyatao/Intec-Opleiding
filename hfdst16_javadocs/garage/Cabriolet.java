package hfdst16_javadocs.garage;

public class Cabriolet extends SportCar {

    private int count = 0;
    private boolean openRoof;

    public Cabriolet() {
    }

    public Cabriolet(String color) {
        super(color);
    }

    //  public void setColor(String color) {
    //     this.color = color;
    //  }

    public boolean isRoofOpen () {
        return false;
    }

    // public double getSpeed() {
    //     return speed;
    //  }

    // public void setSpeed(double speed) {
    //     this.speed = speed;

    // public int getCount () {
    //  }
}
