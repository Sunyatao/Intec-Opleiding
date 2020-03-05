package Hfdst05_Java_programmeertaal;

public class Ex17_05_VanMin10Tot10 {
    public static void main(String[] args) {

        for (int getal = -10; getal <= 10; getal++) {

            if (getal < 0 ) {
                System.out.println(getal);
            }
            else if (getal > 0) {
                System.out.println("+"+getal);
            }
            else {
                System.out.println(getal);
            }

        }

    }
}
