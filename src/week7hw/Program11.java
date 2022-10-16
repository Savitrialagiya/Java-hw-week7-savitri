package week7hw;

import java.util.Scanner;

//Write a java program to print the numbers between 1 to 100 which can be divided by 3
//and 5 separately.
public class Program11 {
    public static void main(String[] args) {
        Program11 obj = new Program11();
        obj.numbers();
    }

    public void numbers() {
        System.out.println("\n\ndivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.println(i + "");
        }
        System.out.println("\ndivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + "");
        }
        System.out.println("\n\ndivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + "");
        }
        System.out.println("\n");

    }
}
