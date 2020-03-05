package Hfdst07_Arrays.ArraysHarryTheArray;

import java.util.Arrays;

public class ArraysAClass {
    public static void print() {

        int [] intArray = new int[] {1,2,3,4,5,6,7,8,9};
        int [] intArray2 = {7,6,9,1,4,8,5,3,2};

        System.out.println(ArraysTools.isSorted(intArray));
        System.out.println(ArraysTools.isSorted(intArray2));

        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));

        String arrayString = Arrays.toString(intArray2);
        System.out.println(arrayString);


        int [] sortedSearchArray = ArraysTools.sort(intArray2);

        System.out.println(sortedSearchArray);

        System.out.println(ArraysTools.search(sortedSearchArray,5));
        System.out.println(ArraysTools.search(sortedSearchArray,7));
    }
}
