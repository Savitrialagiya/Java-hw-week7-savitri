package week7hw;
//Write a Java program to calculate the average value of array elements

public class Program19 {
    public static void main(String[] args) {
        avgOfArray();
    }

    public static void avgOfArray() {
        int[] numbers = new int[]{20, 30, 40, 35, -15, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);

    }

}
