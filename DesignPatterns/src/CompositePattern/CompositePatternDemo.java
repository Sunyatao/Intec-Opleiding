package CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Saiyan hero = new Saiyan("Goku","Low_grade_soldier", 9000);

        Saiyan antagonist = new Saiyan("Vegeta","Prince", 8500);

        Saiyan hybrid = new Saiyan("Gohan","Time_Bomb", 12000);

        Saiyan son1 = new Saiyan("Goten","Fusion", 7500);
        Saiyan son2 = new Saiyan("Trunks","Fusion", 7500);

        Saiyan underdog1 = new Saiyan("Broly","Time_Bomb", 14000);
        Saiyan underdog2 = new Saiyan("Kefla","Time_Bomb", 12000);

        hero.add(antagonist);
        hero.add(hybrid);

        hybrid.add(son1);
        hybrid.add(son2);

        antagonist.add(underdog1);
        antagonist.add(underdog2);

        System.out.println(hero);
        System.out.println(antagonist);

        for (Saiyan head : antagonist.getSubordinates()) {
            System.out.println(head);

            for (Saiyan saiyan : hybrid.getSubordinates()) {
                System.out.println(saiyan);
            }
        }
    }
}
