package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

public class FisherBoat extends Boat{

    private double netSize;
    private DeckHand deckhand1;


    public FisherBoat(String name, double weight, DeckHand deckhand1) {
        super(name, weight);
        this.deckhand1 = deckhand1;
    }

}
