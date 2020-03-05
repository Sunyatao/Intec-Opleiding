package Hfdst10_Overerving_en_klassenhierarchie.CarInheritance;


public class SUV extends Car {

    private boolean bullbar;

    public SUV(String color, int hp) {
        super(color, hp);
    }


    public boolean isBullbar() {
        return bullbar;
    }

    public void setBullbar(boolean bullbar) {
        this.bullbar = bullbar;
    }

    public void driving4x4(boolean driving4x4) {
        if (getSpeed() > 30) {
            driving4x4 = false;
        }

    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }
}
