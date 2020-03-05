package Testweek.Test;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Voer een getal in tussen 0 en 10.000");
        int input = kbd.nextInt();

        if (input%2 == 0) {
            System.out.println("Dit is een even getal");
        } else {
            System.out.println("Dit is een oneven getal");
        }
    }
}
