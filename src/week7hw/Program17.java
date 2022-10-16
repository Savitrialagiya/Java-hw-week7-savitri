package week7hw;

import java.lang.reflect.Array;
import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Program17 {
    public static void main(String[] args) {
        sortArray();

    }
    public static void sortArray() {
        int[] arraydata1 = {25, 45, 55, 6, 8, 65, 95, 71, 56, 3};
        String[] arraydata2 = {"bhajipav", "Panipuri", "vadapav", "dahiwada", "sevpuri"};
        System.out.println("Original value: " + Arrays.toString((arraydata1)));
        Arrays.sort(arraydata1);
        System.out.println("Sorted value: " + Arrays.toString((arraydata1)));
        System.out.println("Original value: " + Arrays.toString((arraydata2)));
        Arrays.sort(arraydata2);
        System.out.println("Sorted value: " + Arrays.toString((arraydata2)));
    }
}
