package Hfdst10_Overerving_en_klassenhierarchie.SocialNetwork;

public class Dog extends Pet {

    public Dog() {
        super();
    }

    public Dog(double weight, int age, String name) {
        super(weight, age, name);
    }

    public int calculateRealAge () {
        return getAge()*7;
    }

}
