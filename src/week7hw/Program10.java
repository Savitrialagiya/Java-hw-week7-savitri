package week7hw;

import java.util.Scanner;

/**Write a java program to input any two number and ask user to enter their symbol (+, -,
 , *) find addition, Subtraction, multiplication and division according to their symbol
 (using if else)
 */

public class Program10 {
    public static void main(String[] args) {
    Program10 obj = new Program10();
     obj.symbol();
    }
    public void symbol(){
        char ch;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number");
        int num2 = scanner.nextInt();

        System.out.println("Enter the operator you want(+,-,*,/):");
        ch = scanner.next().charAt(0);

        if (ch=='+'){
            System.out.println("Addition of"+num1+"+"+num2+ "="+(num1+num2));
        } else if (ch=='-') {
            System.out.println("Subtraction of"+num1+"-"+num2+ "="+(num1-num2));
        }else if (ch=='*') {
            System.out.println("multiplication of"+num1+"*"+num2+ "="+(num1*num2));
        }else if (ch=='/') {
            System.out.println("Division of"+num1+"/"+num2+ "="+(num1/num2));
        }
        else {
            System.out.println("Operator is not available");
        }
        scanner.close();
    }
}
