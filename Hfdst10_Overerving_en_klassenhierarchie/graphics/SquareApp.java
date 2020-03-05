package Hfdst10_Overerving_en_klassenhierarchie.graphics;

public class SquareApp {
    public static void main(String[] args) {

        Square square1 = new Square();
        square1.setPosition(10, 15);
        square1.setSide(23);

        Rectangle rect1 = new Rectangle(4,4);

        System.out.println(square1.DESCRIPTION);
        System.out.println(rect1.DESCRIPTION);

        System.out.println(square1.getPerimeter());
        System.out.println(square1.getArea());
        System.out.println(square1.getSide());
    }
}
