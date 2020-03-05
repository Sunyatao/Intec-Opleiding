package hfdst20_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een aantal getallen in: ");
        int a = keyboard.nextInt();

        Collection<Integer> list = new ArrayList<>();
        list.add(a);

        System.out.println(list);

        keyboard.close();

    }
}
