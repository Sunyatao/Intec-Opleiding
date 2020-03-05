package Hfdst08_Klassen_Definiëren.Dragons_Extra_Oef;

public class Dragons {

    private int height = 0;
    private String name = "";
    private String color = "";
    private boolean breathFire = false;

    public Dragons(int height, String name, String color, boolean breathFire) {
        this.height = height;
        this.name = name;
        this.color = color;
        this.breathFire = breathFire;
    }

    public Dragons() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBreathFire() {
        return breathFire;
    }

    public void setBreathFire(boolean breathFire) {
        this.breathFire = breathFire;
    }
}
