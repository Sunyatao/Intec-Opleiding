package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Saiyan {
    private String name;
    private String rang;
    private int power_level;
    private List<Saiyan> subordinates;

    // constructor
    public Saiyan(String name,String rang, int pow) {
        this.name = name;
        this.rang = rang;
        this.power_level = pow;
        subordinates = new ArrayList<Saiyan>();
    }

    public void add(Saiyan e) {
        subordinates.add(e);
    }

    public void remove(Saiyan e) {
        subordinates.remove(e);
    }

    public List<Saiyan> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Saiyan :[ Name : " + name + ", rang : " + rang + ", power level :" + power_level +" ]");
    }
}