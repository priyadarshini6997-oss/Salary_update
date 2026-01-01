package com.index;

import java.util.Scanner;

public class Salary_update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary;
		System.out.println("Enter the salary");
		salary = sc.nextDouble();
		//Add bonus
		salary += 5000;
		System.out.println("Salary after bonus of 5000: "+salary);
		//tax deduction(10%)
		salary -=(salary*0.10);
		System.out.println("Salary after tax deduction: "+salary);
		//salary hike(15%)
		salary *= 1.15;
		System.out.println("Salary after hike: "+salary);
		//split salary into two account
		salary /= 2;
		System.out.println("Salary transfered to each bank account: "+salary);
		sc.close();

	}

}
