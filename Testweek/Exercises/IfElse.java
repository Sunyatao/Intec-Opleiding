package Testweek.Exercises;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner kdb = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = kdb.nextInt();

        if (age > 100){
            System.out.println("U bent te oud");
        } else if (age <= 12) {
            System.out.println("U bent veel te jong");
        } else if (age > 12 && age < 18 ) {
            System.out.println("U bent te jong");
        } else {
            System.out.println("Leeftijd OK");
        }
    }
}
