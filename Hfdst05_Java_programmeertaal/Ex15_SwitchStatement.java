package Hfdst05_Java_programmeertaal;

import java.util.Scanner;

public class Ex15_SwitchStatement {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("geef de nummer van de maand in");
        int month = keyboard.nextInt();

        int days;


        while (month > 12 || month < 1) {
            System.out.println("Foutief getal, gelieve een getal tussen 1 en 12 in te geven");
            month = keyboard.nextInt();
        }

            switch (month) {
                default:
                    days = 0;
                    break;
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
            }

        System.out.println(days);

        }
    }

