package Testweek.Exercises;

import java.util.Scanner;

public class HelloInput {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter a name");
        String input = kbd.nextLine();

        System.out.println("Hello " + input);
    }
}
