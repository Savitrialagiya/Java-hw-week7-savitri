package week7hw;
/**Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;
// 1. century (100%= and 400%=0)
//2. yearly (100%!=0 and 4%=0)
public class Program2 {
    public static void main(String[] args) {
    Program2 obj = new Program2();
    obj.leapYear();
    }
    public void leapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = scanner.nextInt();
        //% - modulus - devide the left operant by right operand then retunr remainder
        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0)
        {
            System.out.println("Leap year");
        }else {
            System.out.println("Not Leap year");
            scanner.close();
        }
    }
}
