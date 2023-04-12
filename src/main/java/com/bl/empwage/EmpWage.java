package com.bl.empwage;
import java.lang.Math;
public class EmpWage
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation Program!");
        //To Check Employee Present or Absent.
        int empAttendance = (int)((Math.random() * 10) % 2);
        if (empAttendance == 1)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
