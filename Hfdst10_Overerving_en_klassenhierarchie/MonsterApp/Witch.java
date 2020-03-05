package Hfdst10_Overerving_en_klassenhierarchie.MonsterApp;

public class Witch extends MagicMonster {

    private String name;

    public Witch () {
        super();
    }

    public Witch(int hitPoints) {
        super(hitPoints);
    }

    public Witch(int hitPoints, int magicPoints) {
        super(hitPoints, magicPoints);
    }

    public Witch(int hitPoints, int magicPoints, String name) {
        super(hitPoints, magicPoints);
        this.name = name;
    }


    public void fireballAttack (Monster in) {
         int hpDamage = getHitPoints() - 8;
         int mpMinus = getMagicPoints() - 5;
    }
}

