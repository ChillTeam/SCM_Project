package com.scm;
import java.util.*;

public class ProgramInputOutput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name="";
		System.out.print("Input name : ");
		name = input.nextLine();
		double salary;
		System.out.print("Input salary : ");
		salary = input.nextDouble();
		double circulation;
		System.out.print("Input circulation : ");
		circulation = input.nextDouble();
		Salespeople emp = new Salespeople(name, salary, circulation) ;
		System.out.println("Name  : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Circulation  : "+emp.getCirculation()+"   ");
		System.out.println("Wage : "+emp.wages());
	}
}
