package Testweek.Test;

import java.util.Scanner;

public class MyCalc {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Gelieve een eerste getal in te geven.");
        int getal1 = kbd.nextInt();

        System.out.println("Gelieve een tweede getal in te geven.");
        int getal2 = kbd.nextInt();

        System.out.println("kies een nummer 1-4 " +
                "\n1 = optellen" +
                "\n2 = aftrekken" +
                "\n3 = delen" +
                "\n4 = vermenigvuldigen" +
                "\n\n Maak uw keuze nu" );
        int getal3 = kbd.nextInt();

        while (getal3 < 1 || getal3 > 4){
            System.out.println("Foutief getal, gelieve een getal tussen 1-4 in te geven" );
            getal3 = kbd.nextInt();
        }

        if (getal3 == 1) {
            System.out.println(getal1 + " plus " + getal2 + " = " + (getal1+getal2));
        }
        else if (getal3 == 2) {
            System.out.println(getal1 + " min " + getal2 + " = " + (getal1-getal2));
        }
        else if (getal3 == 3) {
            System.out.println(getal1 + " gedeeld door " + getal2 + " = " + (getal1 / getal2));
        }
        else if (getal3 == 4) {
            System.out.println(getal1 + " maal " + getal2 + " = " + (getal1 * getal2));
        }

        kbd.close();
    }
}



