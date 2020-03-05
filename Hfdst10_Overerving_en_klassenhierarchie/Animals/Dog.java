package Hfdst10_Overerving_en_klassenhierarchie.Animals;

public class Dog extends Animal {

    private final int PAWS = 4;

    public Dog() {
    }

    public Dog(String name, int weight, String gender) {
        super(name, weight, gender);
    }

}
