package Hfdst07_Arrays;

import java.util.Arrays;

public class ArraysSplitAString_ExtraOef {
    public static void main(String[] args) {

        String splitString = "this is a test";
        String[] testArray = splitString.split(" ");


        for (String el: testArray) {
            System.out.println(el);
        }

        for(int i = 0; i < testArray.length; i++) {
            System.out.println("Woord " + i + ": " + testArray[i]);
        }
        System.out.println(Arrays.toString(testArray));
    }
}
