package Hfdst10_Overerving_en_klassenhierarchie.graphics;

public class Rectangle {

    private int width;
    private int height;
    private int x;
    private int y;
    public final String DESCRIPTION = "Rectangle";

    public Rectangle(int s, int s1) {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getArea () {
        return width * height;
    }

    public int getPerimeter () {
        return (width+height)*2;
    }

    public void setPosition (int x, int y) {
        this.x = x;
        this.y = y;
    }
}


