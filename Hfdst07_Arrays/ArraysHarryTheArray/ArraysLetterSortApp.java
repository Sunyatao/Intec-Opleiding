package Hfdst07_Arrays.ArraysHarryTheArray;

public class ArraysLetterSortApp {
    public static void main(String[] args) {
        char[] c;
        String s = "hey ho, leaaaabtbbscc";

        c = s.toCharArray();
        c = filterAlphabet(c);
        sortCharArray(c);
        System.out.println(String.copyValueOf(c).trim());
    }

    private static char[] filterAlphabet(char[] c) {
        char[] copy = new char[c.length];
        int indexNextLetter = 0;
        for (int i = 0; i < c.length; i++) {
            if (!(c[i] > 122 || c[i] < 97)) {
                copy[indexNextLetter++] = c[i];
            }
        }
        c = new char[indexNextLetter];
        for (int i = 0; i < c.length; i++) {
            c[i] = copy[i];
        }
        return c;

    }

    private static char[] sortCharArray(char[] c) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < (c.length - 1); i++) {

                if (c[i] > c[i + 1]) {
                    char temp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return c;
    }
}
