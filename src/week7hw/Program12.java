package week7hw;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Program12 {
    public static void main(String[] args) {
        Program12.alphabetNumberSpecial();
    }

    public static void alphabetNumberSpecial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character : ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a special Character");
        }
    }
}
