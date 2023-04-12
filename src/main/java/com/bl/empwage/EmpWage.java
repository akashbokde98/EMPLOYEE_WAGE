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
        int empAttendance = (int)((Math.random() * 10) % 3);
        if (empAttendance == 1)
        {
            System.out.println("Employee is Present Full Time");
            int dailyWage = wagePerHour * fullDayHour; //Calculating Full Time Daily Wage.
            System.out.print("Daily Employee Wage:" + dailyWage);
        }
        else if (empAttendance == 2)
        {
            System.out.println("Employee is Present Part Time");
            int dailyWage = wagePerHour * partTimeHour; //Calculating Part Time Daily Wage.
            System.out.print("Daily Employee Wage:" + dailyWage);
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
