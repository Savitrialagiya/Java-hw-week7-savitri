package week7hw;
/**Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
     oddEven();
    }

    public static void oddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();

        String result = (num % 2 ==0) ? "Even" : "Odd";
        System.out.println("number is :" +result);
        scanner.close();
    }
}
