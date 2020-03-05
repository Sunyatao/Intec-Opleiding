package Hfdst07_Arrays;

public class ArraysVeelvoudenVan7_ForEach_ReverseOrder_Oef_01_010203 {
    public static void main(String[] args) {
        int[] numbers = {7,14,21,28,35,42,49,56,63,70,77,84,91,98,105,112,119,126,133,140};
        for (int n: numbers) {
            System.out.println(n);
        }

        //ook oplossing:

        int[] array = new int[20];
        for(int i = 0; i < array.length; i ++)	{
            array[i] = (i+1) * 7;}


        {
            for(int el: array) {
                System.out.println(el);
            }

            for(int i = (array.length - 1); i>= 0; i--) {
                System.out.println(array[i]);
            }
        }

    }

}
