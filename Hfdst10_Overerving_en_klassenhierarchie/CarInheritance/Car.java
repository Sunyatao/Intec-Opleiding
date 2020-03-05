package Hfdst10_Overerving_en_klassenhierarchie.CarInheritance;

public abstract class Car {

    private String color;
    private int speed;
    private int hp;

    public Car() {
    }

    public Car(String color, int hp) {
        this.color = color;
        this.hp = hp;
    }

    public int accelerater (int amount) {
        return (amount + (hp/100));
    }

    public int slow (int amount) {
        return (amount - (hp/100));
    }

    public  int park (int amount) {
        return speed = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }
}
