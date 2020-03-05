package Hfdst05_Java_programmeertaal;

public class Ex16_03_MachtenVan5KleinerDan10000 {
    public static void main(String[] args) {

        //5 tot de nulde macht is 1
        int macht = 1;
        do {
            System.out.println(macht);
            macht*=5;
        }while(macht < 10000);
    }
}
