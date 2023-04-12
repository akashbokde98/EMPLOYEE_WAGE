package com.bl.empwage;
import java.lang.Math;

public class EmpWage
{
    public static void main(String[] args)
    {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int WorkingDayPerMonth = 20;
        int totalDaysOfMonth = 30;
        int totalWageOfMonth = 0;
        int day = 0;
        int totalWorkingDay = 0;

        System.out.println("Welcome To Employee Wage Computation Program!");
        while (day < totalDaysOfMonth && totalWorkingDay < WorkingDayPerMonth)
        {
            //Checking Employee Present or Absent.
            switch ((int) ((Math.random() * 10) % 3))
            {
                case 1: {
                    System.out.println("Employee is Present Full Time");
                    int dailyWage = wagePerHour * fullDayHour; //Calculating Full Time Daily Wage.
                    System.out.println("Daily Employee Wage:" + dailyWage);
                    totalWageOfMonth += dailyWage; //Calculating Total Monthly Wage.
                    totalWorkingDay++;
                    break;
                }
                case 2: {
                    System.out.println("Employee is Present Part Time");
                    int dailyWage = wagePerHour * partTimeHour; //Calculating Part Time Daily Wage.
                    System.out.println("Daily Employee Wage:" + dailyWage);
                    totalWageOfMonth += dailyWage; //Calculating Total Monthly Wage.
                    totalWorkingDay++;
                    break;
                }
                default://if all cases are not matched.
                    System.out.println("Employee is Absent");
            }
            day++;
        }
        System.out.print("Total Wage for a Month:" + totalWageOfMonth);
    }
}
