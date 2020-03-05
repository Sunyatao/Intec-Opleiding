package Hfdst05_Java_programmeertaal;

public class Ex17_06_VanMin10Tot10TernaryOperator {
    public static void main(String[] args) {
        for (int number = -10; number <= 10; number++) {
            System.out.println(((number <= 0) ? "" : "+") + number);
        }
    }
}
