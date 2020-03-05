package Hfdst10_Overerving_en_klassenhierarchie.Animals;

abstract class Animal {

    private String name;
    private int weight;
    private String gender;
    private int age;

    public Animal() {
    }

    public Animal(String name, int weight, String gender, int age) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    public Animal(String name, int weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }
}
