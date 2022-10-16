package week7hw;
/**Write a java program input sales id, seller's name, sales amount, and salary basic and
 then fined this sales
 Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2%
 */

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
     salesCommission();
    }
    public static void salesCommission(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales Id :  ");
        int num = scanner.nextInt();
        System.out.println("Enter sellers Name :  ");
        String name = scanner.next();
        double commission = 0.0;
        int rate = 0,sale;
        System.out.println("Enter Sales amount :");
        sale = scanner.nextInt();
        if (sale>=50000 ){
            rate = 35;
            commission = sale*0.35;
        }
        else if (sale>=30000 && sale<50000){
            rate = 20;
            commission = sale*0.20;
        }
        else if (sale>=20000 && sale<30000){
            rate = 10;
            commission = sale*0.10;
        }
        else if (sale>=10000 && sale<20000 ){
            rate = 5;
            commission = sale*0.05;
        }else if (sale<10000){
            rate = 2;
            commission = sale*0.02;
        }
        System.out.println("Commission amount =" + commission);

        scanner.close();

    }
}
