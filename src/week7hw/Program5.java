package week7hw;

import java.util.Scanner;

/**WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
 */
public class Program5 {

    public static void main(String[] args){
        employeeDetail();
    }
    public static void employeeDetail(){
        Scanner scanner = new Scanner(System.in);
        int employeeId, basicSalary, hra,ta,da,pf,grossSalary;
        String employeeName;

        System.out.println("Enter Employee ID: ");
        employeeId = scanner.nextInt();

        System.out.println("Enter Employee Name: ");
        employeeName = scanner.next();

        System.out.println("Enter basic salary: ");
        basicSalary = scanner.nextInt();

        hra = (10*basicSalary)/100;
        da = (8*basicSalary)/100;
        ta = (9*basicSalary)/100;
        pf = (20*basicSalary)/100;
        grossSalary = basicSalary+hra+ta+da-pf;

        System.out.println("--------------------------------------");
        System.out.println("|        Salary Slip                 |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Employee ID   :"+employeeId+"                  |");
        System.out.println("|  Employee Name :"+employeeName+"            |");
        System.out.println("|------------------------------------|");
        System.out.println("|  Basic Salary  :"+basicSalary+"               |");
        System.out.println("|  HRA 10%       :"+hra+"                |");
        System.out.println("|  TA 9%         :"+ta+"                |");
        System.out.println("|  DA 8%         :"+da+"                |");
        System.out.println("|  PF -20%       :"+pf+"                |");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        System.out.println("|Gross Salary    : "+grossSalary+"              |");
        System.out.println("|====================================|");
         scanner.close();


    }
}
