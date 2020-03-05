package Hfdst10_Overerving_en_klassenhierarchie.MonsterApp;

abstract class MagicMonster extends Monster {

    private int magicPoints;
    private int maxMP;

    public MagicMonster() {
        super();
    }

    public MagicMonster (int hitPoints, int magicPoints) {
        super(hitPoints);
        this.magicPoints = magicPoints;
    }

    public MagicMonster(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public void restoreMP(int h) {
    }

    public boolean useMP(int d) {
        return false;
    }


}
