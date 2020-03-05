package Hfdst07_Arrays;

import java.util.Scanner;

public class ArraysCineRouppe {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Welke film wil je zien? \n 1) Labyrinth \n 2) LOTR \n 3) Hot tub time machine \n 4) Thief of bagdad \n \n Geef hier je antwoord:");
        int whichMovie = kbd.nextInt();

        System.out.println("Wat is je leeftijd?");
        int whichAge = kbd.nextInt();

        System.out.println("Welke grootte van drankje wil je? \n 1) Small \n 2) Medium \n 3) Large ");
        int sizeDrink = kbd.nextInt();

        System.out.println("Welke grootte van popcorn wil je? \n 1) Small \n 2) Medium \n 3) Large ");
        int sizePopcorn = kbd.nextInt();

        String[] movies = {"Labyrinth", "LOTR", "Hot tub time machine", "Thief of Bagdad"};
        int[] moviePrices = {6, 12, 10, 8};
        char[] Sizes = {'S','M','L'};
        double[] drinkPrices = {2, 2.5, 3};
        int[] popcornPrices = {3, 4, 5};

        double endPrice = calcPrice(whichAge, moviePrices[whichMovie-1]) + drinkPrices[sizeDrink-1] + popcornPrices[sizePopcorn-1];


        System.out.println("-------------------------------");
        System.out.println("film: " + movies[whichMovie-1]);
        System.out.println("leeftijd: " + whichAge);
        System.out.println("drankje: " + Sizes[sizeDrink-1]);
        System.out.println("popcorn: " + Sizes[sizePopcorn-1]);
        System.out.println("-------------------------------");
        System.out.println("prijs: " + endPrice);

    }

    public static int calcPrice(int age, int price) {
        if (age < 16) {
            price = price / 2;
        } else if (age > 65) {
            price = price - ((price / 100) * 20);
        }
        return price;
    }

}


