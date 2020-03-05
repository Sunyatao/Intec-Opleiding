package Hfdst08_Klassen_Definiëren.Dragons_Extra_Oef;

import java.util.Scanner;

public class DragonsApp {
    public static void main(String[] args) {

        Dragons dragon1 = new Dragons();

        Scanner kbd = new Scanner (System.in);
        System.out.println("Here be dragons, lad! How big do ye want yours?");
        int height = kbd.nextInt();

        dragon1.setHeight(height);

        System.out.println("Your dragon is " + dragon1.getHeight() + " meters tall!!!" );

        System.out.println("-----------------------");

        Dragons dragon2 = new Dragons();

        System.out.println("You have your first dragon! Now let's find you another one, shall we? How big should this one be?");
        int height2 = kbd.nextInt();

        dragon2.setHeight(height2);

        System.out.println("This dragon is " + dragon2.getHeight() + " meters tall!" );

        System.out.println("Do you want to give your second dragon a growing potion? \n 1) no \n 2) yes");
        int growingPotion = kbd.nextInt();

    }
}
