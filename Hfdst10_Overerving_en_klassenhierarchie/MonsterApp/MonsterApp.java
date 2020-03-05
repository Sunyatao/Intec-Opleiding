package Hfdst10_Overerving_en_klassenhierarchie.MonsterApp;

import java.util.Random;

public class MonsterApp {
    public static void main(String[] args) {

        Random attackTurn = new Random();
        int turn = attackTurn.nextInt(2);

        Witch Hazel = new Witch(30,100);
        Bear Yogi = new Bear(50,50);

        Hazel.fireballAttack(Yogi);

        System.out.println(turn);

        System.out.println("Yogi HP: " + Yogi.getHitPoints() + "\nYogi RP: " + Yogi.getRagePoints());
        System.out.println("Hazel HP: " + Hazel.getHitPoints() + "\nHazel MP: " + Hazel.getMagicPoints());


    }
}
