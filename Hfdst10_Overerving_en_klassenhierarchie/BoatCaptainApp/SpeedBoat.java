package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

public class SpeedBoat extends Boat {

    private int horsePower;
    private Captain captain;

    public SpeedBoat(String name, double weight, Captain captain) {
        super(name, weight);
        this.captain = captain;
    }
}
