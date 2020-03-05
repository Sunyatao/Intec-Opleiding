package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

abstract class Boat {

    private double weight;
    //1 knoop = 1,852 km/h
    private double topSpeed;
    private String name;

    public Boat() {
    }

    public Boat(String name, double weight) {
        this.weight = weight;
        this.name = name;
    }

    public void accelerate () {
    }

    @Override
    public String toString() {
        return "Boat{" +
                "km/h=" + topSpeed +
                '}';
    }
}
