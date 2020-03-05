package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

abstract class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this(age);
        this.name = name;
    }
}
