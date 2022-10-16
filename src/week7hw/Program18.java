package week7hw;

import java.util.Scanner;

//Write a Java program to sum values of an array
public class Program18 {
    public static void main(String[] args) {
        Program18 obj = new Program18();
        obj.sumOfArray();
    }

    public void sumOfArray() {
        int sum = 0;
        int myArray[] = {1,2,3,4,5,6,7,8,9};

        for(int i : myArray)
            sum += i;
        System.out.println("The sum is: " +sum);
    }
    }

