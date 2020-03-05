package Hfdst07_Arrays.ArraysStatistics_Oef05;

public class ArraysStatisticsApp_Oef5 {
        public static void main(String[] args) {
            System.out.println(ArraysStatisticsMethods_Oef5.average());
            System.out.println(ArraysStatisticsMethods_Oef5.average(4, 7, 9));
            System.out.println(ArraysStatisticsMethods_Oef5.average(7, 9, 2, 3, 5));
            System.out.println(ArraysStatisticsMethods_Oef5.average(3, 8, 6, 9, 4, 7));
            int[] values = {3, 8, 6, 9, 4, 7};
            System.out.println(ArraysStatisticsMethods_Oef5.average(values));
            System.out.println(ArraysStatisticsMethods_Oef5.max(3, 8, 6, 9, 4, 7));
            System.out.println(ArraysStatisticsMethods_Oef5.min(3, 8, 6, 9, 4, 7));
        }
    }
