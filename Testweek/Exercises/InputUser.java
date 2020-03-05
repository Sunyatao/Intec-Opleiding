package Testweek.Exercises;

public class InputUser {
    public static void main(String[] args) {

        java.util.Scanner kbd = new java.util.Scanner(System.in);
        System.out.println("Please type a number");
        int number = kbd.nextInt();
        System.out.println("Your number is:" + number);
    }
}
