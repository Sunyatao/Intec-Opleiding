package Hfdst10_Overerving_en_klassenhierarchie.SocialNetwork;

abstract class Person {
    private double weight;
    private int age;
    private int count;
    private Address addresss;
    private Pet pets;
    private Hobby hobbies;

    public Person() {
    }

    public Person(int age, Address addresss, Pet pets, Hobby hobbies) {
        this.age = age;
        this.addresss = addresss;
        this.pets = pets;
        this.hobbies = hobbies;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Address getAddresss() {
        return addresss;
    }

    public void setAddresss(Address addresss) {
        this.addresss = addresss;
    }

    public Pet getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = pets;
    }

    public Hobby getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobby hobbies) {
        this.hobbies = hobbies;
    }

    public void showMyHobbies () {
        System.out.println(hobbies);
    }
}
