package Hfdst10_Overerving_en_klassenhierarchie.SocialNetwork;

public class Cat extends Pet {

    public Cat() {
        super();
    }

    public Cat(double weight, int age, String name) {
        super(weight, age, name);
    }

    public int calculateRealAge () {
        return getAge()*9;
    }
}
