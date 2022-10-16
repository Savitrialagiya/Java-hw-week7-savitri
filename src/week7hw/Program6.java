package week7hw;
//Write a java program to input any number and find out if it’s odd or even
import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Program6 obj = new Program6();
        obj.oddEven();
    }

    public void oddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        if (num %2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        scanner.close();
        }
    }

