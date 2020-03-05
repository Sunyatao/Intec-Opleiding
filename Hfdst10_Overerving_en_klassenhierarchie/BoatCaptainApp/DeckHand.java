package Hfdst10_Overerving_en_klassenhierarchie.BoatCaptainApp;

public class DeckHand extends Person {

    private String nickName;

    public DeckHand(String nickName) {
        this.nickName = nickName;
    }

    public DeckHand() {
    }

    public DeckHand(String nickName, int age) {
        super(age);
        this.nickName = nickName;
    }


}
