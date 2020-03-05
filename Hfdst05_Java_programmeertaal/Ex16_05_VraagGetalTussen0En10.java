package Hfdst05_Java_programmeertaal;

import java.util.Scanner;

public class Ex16_05_VraagGetalTussen0En10 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean gelukt = true;

        while(gelukt) {
            System.out.println("Geef uw getal tussen 0 en 10");
            int getal = keyboard.nextInt();

            if (getal > 0 && getal <10) {
                gelukt = false;
                System.out.println("uw getal was correct. getal = " + getal);
            } else {
                System.out.println("verkeerde invoer");
                gelukt = true;
            }

        }

        keyboard.close();

    }
}
