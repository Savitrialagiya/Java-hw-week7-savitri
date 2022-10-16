package week7hw;
//Same as above program-8 using switch statement.

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String Name: ");
        String city = scanner.next();

           switch (city) {
                case "a":
                case "A":
                System.out.println("Ahmdabad");
                break;
               case "b":
               case "B":
                System.out.println("Bombay");
                break;
               case "c":
               case "C":
                System.out.println("Chennai");
                break;
               case "d":
               case "D":
                System.out.println("Dallas");
                break;
               case "e":
               case "E":
                System.out.println("Eklera");
                break;
               case "f":
               case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");

        }
    }
}
