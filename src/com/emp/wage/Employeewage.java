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
		int randomNum = random.nextInt(3);
		
		if(randomNum==1) {
			System.out.println("Employee is Present");
			Salary = WagePerHour * fullDayHour;

	}
		else if(randomNum==2) {
			System.out.println("Employee is working Half day");
			Salary = WagePerHour * HalfDayHour;
		}
		else {
		System.out.println("Employee is Absent");
	}
		System.out.println("Salary is: "+Salary);

}
}
