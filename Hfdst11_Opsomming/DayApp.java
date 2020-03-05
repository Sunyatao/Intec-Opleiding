package Hfdst11_Opsomming;

public class DayApp {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.TUESDAY;

        System.out.println(day1.name());
        System.out.println(day2.ordinal());
    }

    public static void printDay (Day day) {

        System.out.println(day.name());
        System.out.println(day.ordinal());

    }
}
