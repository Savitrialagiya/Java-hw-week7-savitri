package week7hw;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
public class Program8 {

    public static void main(String[] args) {
        Program8 obj = new Program8();
        obj.cityName();
    }

    public void cityName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Alphabet: ");
        char city = input.next().charAt(0);//reads first alphabet

        if (city == 'a' || city == 'A') {
            System.out.println("Ahmdabad");
        } else if (city =='b' || city =='B') {
            System.out.println("Bombay");
        } else if (city =='c' || city == 'C') {
            System.out.println("Chennai");
        } else if (city == 'd' || city == 'D') {
            System.out.println("Dallas");
        } else if (city == 'e' || city == 'E') {
            System.out.println("Egypt");
        } else if (city == 'f' || city == 'F' ) {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry");
        }
        input.close();

    }

}
