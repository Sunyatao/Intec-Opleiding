package Hfdst10_Overerving_en_klassenhierarchie.SocialNetwork;

public class PersonMainApp {

    public static void main(String[] args) {

        Puppy puppy1 = new Puppy(6.0,1,"Floris");
        Kitten kitten1 = new Kitten(3.0,2,"Mitten" );
        Address leuven = new Address("Naamsestraat");
        Kiting kiting1 = new Kiting (2, "Kiting",leuven, 3);

        Fashionista fash1 = new Fashionista(34,leuven,kitten1, kiting1);

        fash1.setPets(kitten1);

        System.out.println(puppy1.calculateRealAge());
        System.out.println(kitten1.calculateRealAge());
    }
}
