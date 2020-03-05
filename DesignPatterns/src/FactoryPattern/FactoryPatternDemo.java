package FactoryPattern;

import java.util.Scanner;

public class FactoryPatternDemo
{
    public static void main(String[] args)
    {
        HumanFactory SF = new HumanFactory();
        System.out.println("Geef 'Meisje' of 'Jongen' in");
        Scanner s = new Scanner(System.in);
        String human = s.nextLine();
        Human sh = SF.getHuman(human);
        sh.create();

    }
}
