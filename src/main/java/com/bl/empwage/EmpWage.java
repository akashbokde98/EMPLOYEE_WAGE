package com.bl.empwage;
import java.lang.Math;
import java.util.Scanner;

public class EmpWage
{
    //Common Data Of All Companies.
    int fullDayHour = 8;
    int partTimeHour = 4;
    int totalDaysOfMonth = 30;
    int totalDailyWorkingHour = 0;
    int totalWorkingDay = 0;
    int totalWageOfMonth = 0;


    // Method To Calculate Total Employee Wage.
    int calculateEmpWage(int workingDayPerMonth, int totalWorkingHourForMonth, int wagePerHour)
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
        //Variable Declaration
        int wagePerHour;
        int WorkingDayPerMonth;
        int totalWorkingHourForMonth;
        int totalEmpWage;

        System.out.print("Enter Number Of Companies:");
        int numOfCmp = sc.nextInt();
        //Created obj of Class to call method.
        EmpWage obj = new EmpWage();
        //Iterating Over Numbers Of Company and Calculating Emp Wage.
        for (int i = 1; i <= numOfCmp; i++)
        {
            System.out.println("Enter Data For Company-"+ i);
            //Initializing
            System.out.print("Wage Per Hour:");
            wagePerHour = sc.nextInt();
            System.out.print("Working Day Per Month:");
            WorkingDayPerMonth = sc.nextInt();
            System.out.print("Working Hour Per Month:");
            totalWorkingHourForMonth = sc.nextInt();
            //Calling and Storing Method
            totalEmpWage = obj.calculateEmpWage(WorkingDayPerMonth, totalWorkingHourForMonth, wagePerHour);
            System.out.println("Total Employee Wage:" + totalEmpWage);
            System.out.println("------------------");
        }
    }
}
