package hfdst16_javadocs.enums;

public enum Color {
    BLACK (0, 0, 0),
    WHITE (255,255,255),
    RED (255,0,0),
    GREEN (0,255,0),
    BLUE (0,0,255);

    private int[] rgb;

    Color(int r, int g, int b) { // probleem met public te zetten :/
    }
}
