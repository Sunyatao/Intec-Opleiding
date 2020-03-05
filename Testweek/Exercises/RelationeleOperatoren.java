package Testweek.Exercises;

import java.util.Scanner;

public class RelationeleOperatoren {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter a variable");
        int var1 = kbd.nextInt();

        System.out.println("Enter another variable");
        int var2 = kbd.nextInt();

        boolean bln1 = var1 == var2;
        boolean bln2 = var1 != var2;
        boolean bln3 = var1 < var2;
        boolean bln4 = var1 > var2;

        System.out.println("getal 1 == getal 2 = " + bln1);
        System.out.println("getal 1 != getal 2 = " + bln2);
        System.out.println("getal 1 < getal 2 = " + bln3);
        System.out.println("getal 1 > getal 2 = " + bln4);


    }
}
