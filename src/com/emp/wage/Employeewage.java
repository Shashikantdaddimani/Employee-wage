package com.emp.wage;

import java.util.Random;

public class Employeewage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
	
		Random random  = new Random();
		int WagePerHour = 20;
		int fullDayHour = 8;
		int HalfDayHour = 4;
		int Salary = 0;
		int monthlySalry = 0;
		int WorkingDaysPerMonth = 20;
	
		for (int i=1; i<=WorkingDaysPerMonth;i++) {
			
		
		int randomNum = random.nextInt(3);
		
		switch(randomNum)
		{
		case 0:
			System.out.println("Employee is Absent");
			break;
		case 1:
			System.out.println("Employee is working fullday: ");
			Salary = WagePerHour * fullDayHour;
			break;
		case 2:
			System.out.println("\"Employee is working Halfday: ");
			Salary = WagePerHour * HalfDayHour;

		}
		monthlySalry = monthlySalry * HalfDayHour;
		System.out.println("Salary is: "+Salary);
		}
		System.out.println("Total Salary: "+monthlySalry);
}
}
