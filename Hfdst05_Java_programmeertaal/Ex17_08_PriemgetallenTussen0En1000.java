package Hfdst05_Java_programmeertaal;

public class Ex17_08_PriemgetallenTussen0En1000 {
    public static void main(String[] args) {

        final int MAX = 10000;
        int count = 0;
        for (
                int number = 2;
                number <= MAX; number++) {
            boolean isPrime = true;
            for (int i = 2; (i < number) && isPrime; i++) {
                isPrime = ((number % i) != 0);
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("Number of primes " + count);
    }
}