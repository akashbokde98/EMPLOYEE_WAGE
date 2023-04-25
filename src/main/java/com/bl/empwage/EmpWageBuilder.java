package com.bl.empwage;
import java.lang.Math;
import java.util.Scanner;

public class EmpWageBuilder
{
    //Common Data Of All Companies.
    private static final int fullDayHour = 8;
    private static final int partTimeHour = 4;
    private static final int totalDaysOfMonth = 30;
    private static int totalDailyWorkingHour, totalWorkingDay, totalWageOfMonth  = 0;
    final String companyName;
    final int wagePerHour, workingDayPerMonth, totalWorkingHourForMonth;
    final long totalEmpWage;

    //Constructor
    public EmpWageBuilder(String companyName, int wagePerHour, int workingDayPerMonth, int totalWorkingHourForMonth)
    {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDayPerMonth = workingDayPerMonth;
        this.totalWorkingHourForMonth = totalWorkingHourForMonth;
        totalEmpWage = calculateEmpWage();
        System.out.println("Total Employee Wage is: " + totalEmpWage);
    }

    // Method To Calculate Total Employee Wage.
    public int calculateEmpWage()
    {
        int day = 0;
        while (day < totalDaysOfMonth && totalWorkingDay < workingDayPerMonth && totalDailyWorkingHour < totalWorkingHourForMonth)
        {
            //Checking Employee Present or Absent.
            switch ((int) ((Math.random() * 10) % 3))
            {
                case 1: {
                    int dailyWage = wagePerHour * fullDayHour; //Calculating Full Time Daily Wage.
                    totalWageOfMonth += dailyWage; //Calculating Total Monthly Wage.
                    totalWorkingDay++;
                    totalDailyWorkingHour++;
                    break;
                }
                case 2: {
                    int dailyWage = wagePerHour * partTimeHour; //Calculating Part Time Daily Wage.
                    totalWageOfMonth += dailyWage; //Calculating Total Monthly Wage.
                    totalWorkingDay++;
                    totalDailyWorkingHour++;
                    break;
                }
                default://if all cases are not matched.
            }
            day++;
        }
        return totalWageOfMonth;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation Program!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Companies:");
        int numOfCmp = sc.nextInt();

        //Iterating Over Numbers Of Company and Printing Emp Wage.
        for (int i = 1; i <= numOfCmp; i++)
        {
            System.out.println("Enter Data For Company-"+ i);
            //Taking Input Data
            System.out.print("Enter Company Name:");
            String companyName = sc.next();
            System.out.print("Wage Per Hour:");
            int wagePerHour = sc.nextInt();
            System.out.print("Working Day Per Month:");
            int WorkingDayPerMonth = sc.nextInt();
            System.out.print("Working Hour Per Month:");
            int totalWorkingHourForMonth = sc.nextInt();
            //Creating Object and Calling Constructor
            EmpWageBuilder obj = new EmpWageBuilder(companyName, wagePerHour, WorkingDayPerMonth, totalWorkingHourForMonth);
            System.out.println("---------------------");
        }
    }
}
