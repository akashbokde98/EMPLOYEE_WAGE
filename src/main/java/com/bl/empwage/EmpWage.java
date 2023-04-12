package com.bl.empwage;
import java.lang.Math;
public class EmpWage
{
    public static void main(String[] args)
    {
        int wagePerHour = 20;
        int fullDayHour = 8;

        System.out.println("Welcome To Employee Wage Computation Program!");
        //Checking Employee Present or Absent.
        int empAttendance = (int)((Math.random() * 10) % 2);
        if (empAttendance == 1)
        {
            System.out.println("Employee is Present");
            int dailyWage = wagePerHour * fullDayHour; //Calculating Daily Wage.
            System.out.print("Daily Employee Wage:" + dailyWage);
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
