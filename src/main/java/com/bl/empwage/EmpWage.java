package com.bl.empwage;
import java.lang.Math;

public class EmpWage
{
    public static void main(String[] args)
    {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        System.out.println("Welcome To Employee Wage Computation Program!");
        //Checking Employee Present or Absent.
        switch ((int) ((Math.random() * 10) % 3))
        {
            case 1 -> {
                System.out.println("Employee is Present Full Time");
                int dailyWage = wagePerHour * fullDayHour; //Calculating Full Time Daily Wage.
                System.out.print("Daily Employee Wage:" + dailyWage);
            }
            case 2 -> {
                System.out.println("Employee is Present Part Time");
                int dailyWage = wagePerHour * partTimeHour; //Calculating Part Time Daily Wage.
                System.out.print("Daily Employee Wage:" + dailyWage);
            }
            default -> //if all cases are not matched.
                    System.out.println("Employee is Absent");
        }
    }
}
