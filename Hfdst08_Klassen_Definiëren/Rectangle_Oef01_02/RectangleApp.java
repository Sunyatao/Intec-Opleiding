package Hfdst08_Klassen_Definiëren.Rectangle_Oef01_02;

import Hfdst08_Klassen_Definiëren.Rectangle_Oef01_02.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();

        rect.height = 5;
        rect.width = 7;
        rect.x = 8;
        rect.y = 4;

        Rectangle rect2 = new Rectangle();

        rect2.height = 7;
        rect2.width = 3;
        rect2.x = 6;
        rect2.y = 5;

        System.out.println(rect.width);
        System.out.println(rect.height);
        System.out.println(rect.y + rect.x);
        System.out.println("-----------------");
        System.out.println(rect2.width);
        System.out.println(rect2.height);
        System.out.println(rect2.y + rect.x);
    }
}
