package Hfdst10_Overerving_en_klassenhierarchie.Superheroes;

public abstract class Hero {

    private String alias;
    private int age;

    public abstract void useSuperPower();

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
