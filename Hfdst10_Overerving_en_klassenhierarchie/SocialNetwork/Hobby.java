package Hfdst10_Overerving_en_klassenhierarchie.SocialNetwork;

abstract class Hobby {

    private int TimePerWeek;
    private String name;
    private Address location;
    private int count;

    public Hobby(int timePerWeek, String name, Address location, int count) {
        TimePerWeek = timePerWeek;
        this.name = name;
        this.location = location;
        this.count = count;
    }

    public int getTimePerWeek() {
        return TimePerWeek;
    }

    public void setTimePerWeek(int timePerWeek) {
        TimePerWeek = timePerWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
