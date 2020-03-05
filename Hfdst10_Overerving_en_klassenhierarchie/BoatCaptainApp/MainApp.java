package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

public class MainApp {
    public static void main(String[] args) {

        Captain captain1 = new Captain("Cyriel",63);
        DeckHand deckHand1 = new DeckHand("Duimpje",61);
        FisherBoat fisherboat1 = new FisherBoat("Z53 de windster",25000,deckHand1);

        Captain captain2 = new Captain("Bruno",42);
        SpeedBoat speedBoat1 = new SpeedBoat("Lightning Bolt", 5000, captain2);

        Captain captain3 = new Captain("Maarten",24);
        SailBoat sailBoat1 = new SailBoat("Tubby", 200, 14, captain3);

    }
}
