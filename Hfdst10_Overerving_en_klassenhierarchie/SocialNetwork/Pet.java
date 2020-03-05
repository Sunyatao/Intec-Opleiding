package Hfdst10_Overerving_en_klassenhierarchie.SocialNetwork;

abstract class Pet {
    private double weight;
    private int age;
    private String name;
    private int realAge;

    public Pet() {
    }

    public Pet(int age) {
        this.age = age;
    }

    public Pet(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void beCute (){
    }

}
