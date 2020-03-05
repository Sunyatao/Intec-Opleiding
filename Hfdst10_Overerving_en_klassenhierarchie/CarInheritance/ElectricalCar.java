package Hfdst10_Overerving_en_klassenhierarchie.CarInheritance;

public class ElectricalCar extends Car {

    private int battery;

    public ElectricalCar(String color, int hp) {
        super(color, hp);
    }

    @Override
    public int accelerater(int amount) {
        return super.accelerater(amount);
    }

    @Override
    public int slow(int amount) {
        return super.slow(amount);
    }

    @Override
    public int park(int amount) {
       return super.park(amount);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public void charge (int amount) {
    }

}
