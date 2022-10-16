package week7hw;
//Write a Java program to test if an array contains a specific value
public class Program20 {
    public static void main(String[] args) {
    specificValue();
    }
    public static void specificValue(){
    int[] num = {1,2,3,4,5,6};
    int tofind = 3;
    boolean found = false;

    for (int n : num) {
        if (n==tofind){
            found = true;
            break;
        }
    }
    if(found) {
        System.out.println(tofind + " is found.");
    } else
        System.out.println(tofind + " is not found.");
    }
}
