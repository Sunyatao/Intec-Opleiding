package Hfdst05_Java_programmeertaal.Ex18_Methoden;

public class BmiUtility {

    public static float calculateBmi (float weight, float height) {
        return weight / ((height / 100F) * (height / 100F));
    }

    public static void printDiagnose (float bmi) {
        System.out.println("your BMI is " + bmi);
    }
}
