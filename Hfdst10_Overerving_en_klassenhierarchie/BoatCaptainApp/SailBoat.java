package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

public class SailBoat extends Boat{

    private double sailSize;
    private Captain captain;

    public SailBoat(String name, double weight, double sailSize, Captain captain) {
        super(name, weight);
        this.sailSize = sailSize;
        this.captain = captain;
    }
}
