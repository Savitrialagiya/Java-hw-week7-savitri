package week7hw;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16 {
    public static void main(String[] args) {
        checkNumber();

    }

    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println(num + " is possitive number.");
        } else if (num < 0) {
            System.out.println(num + " is Negative number.");
        } else {
            System.out.println(num + " is a Zero.");
        }
    }
}
