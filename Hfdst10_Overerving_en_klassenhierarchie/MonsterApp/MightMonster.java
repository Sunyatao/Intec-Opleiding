package Hfdst10_Overerving_en_klassenhierarchie.MonsterApp;

abstract class MightMonster extends Monster {

    private int ragePoints;
    private int maxRP;

    public MightMonster () {
        super();
    }

    public MightMonster(int maxHP) {
        super(maxHP);
    }

    public MightMonster(int maxHP, int maxRP) {
        super(maxHP);
        this.maxRP = maxRP;
    }

    public int getRagePoints() {
        return ragePoints;
    }

    public void setRagePoints(int magicPoints) {
        this.ragePoints = magicPoints;
    }

    public void restoreRP(int h) {
    }

    public boolean useRP(int d) {
        return false;
    }
}
