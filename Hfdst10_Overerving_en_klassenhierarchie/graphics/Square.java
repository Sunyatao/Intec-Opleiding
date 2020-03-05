package Hfdst10_Overerving_en_klassenhierarchie.graphics;

public class Square extends Rectangle {
    public final String DESCRIPTION = super.DESCRIPTION + " Square";

    public Square () {
        this(0);
    }

    public Square(int s) {
        super(s,s);
    }

    public int getSide () {
        return getHeight();
    }

    public void setSide (int side) {
        setHeight(side);
        setWidth(side);
    }

}
