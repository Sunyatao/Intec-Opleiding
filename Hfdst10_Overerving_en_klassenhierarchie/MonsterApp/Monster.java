package Hfdst10_Overerving_en_klassenhierarchie.MonsterApp;

abstract class Monster {

    private int hitPoints;
    private int maxHP;

    public Monster() {

    }

    public Monster(int maxHP) {
        this.maxHP = maxHP;
    }

    public Monster(int hitPoints, int maxHP) {
        this.hitPoints = hitPoints;
        this.maxHP = maxHP;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void heal (int h) {
    }

    public boolean takeDamage (boolean takeDamage) {
        if (hitPoints <= 0) {
            takeDamage = false;
        }
        return takeDamage;
    }
}

