package Hfdst05_Java_programmeertaal.Ex18_Methoden;

public class BmiApplication {
    public static void main(String[] args) {
        System.out.println("Enter your length (cm):");
        float height = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg):");
        float weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(height, weight);
        BmiUtility.printDiagnose(bmi);
    }
}
