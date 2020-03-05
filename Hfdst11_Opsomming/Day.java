package Hfdst11_Opsomming;

public enum  Day {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    private boolean weekday;

    @Override
    public String toString() {
        return "Day{" +
                "weekday=" + weekday +
                '}';
    }
}
