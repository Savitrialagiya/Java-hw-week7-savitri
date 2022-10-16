package week7hw;

import java.util.Scanner;

/**Write a Java program which input any number between 1 to 7 and it print The Days
 name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Program13 {
    public static void main(String[] args) {
        Program13 obj = new Program13();
        obj.getDayName();
    }
    public void getDayName(){
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weekly number(1 to 7): ");
        day =scanner.nextInt();

        if(day<1 || day>7){
            System.out.println("Week contains 1 to 7 days.");
            System.exit(0);
        }
// print weekday name according to give value
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
                break;

        }


    }
}
