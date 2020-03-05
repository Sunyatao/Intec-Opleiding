package Hfdst10_Overerving_en_klassenhierarchie.CarInheritance;

public class Convertible extends Car {

    private boolean sunRoof;

    public Convertible(String color, int hp) {
        super(color, hp);
    }

    public void openRoof(boolean openRoof) {
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}


