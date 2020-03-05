package Hfdst10_Overerving_en_klassenhierarchie.MonsterApp;

public class Bear extends MightMonster {

    private int holeNr;

    public Bear () {
        super();
    }

    public Bear(int hitPoints) {
        super(hitPoints);
    }

    public Bear(int hitPoints, int ragePoints) {
        super(hitPoints, ragePoints);
    }

    public Bear(int hitPoints, int ragePoints, int holeNr) {
        super(hitPoints, ragePoints);
        this.holeNr = holeNr;
    }

    public int bearClawAttack () {
        return bearClawAttack();
    }
}

