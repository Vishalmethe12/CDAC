package org.cdac.prob3;

import java.util.Scanner;

public class Employee {
	private int TotalEmployees;
	private float TotalSalaryExpenses;
	private int empid;
	private String name;
	private float salary;
	
	public int getTotalEmployees() {
		return this.TotalEmployees;
	}
	
	public void setTotalEmployees(int num){
		this.TotalEmployees=num;
	}
	
	public float getTotalSalaryExpenses() {
		return this.TotalSalaryExpenses;
	}
	
	public void setTotalSalaryExpemse(float sal){
		this.TotalSalaryExpenses=sal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter the choice:");
		choice=sc.nextInt();
		System.out.println("1.Add Employee");
		System.out.println("2.Get count of total employees");
		System.out.println("3.Apply Raise in salary ");
		System.out.println("4.Update salary");
		System.out.println("5.Calculate total salary expenses");
		System.out.println("0.Exit");
		while(choice!=0) {
			switch(choice) {
			case 1:
					Employee emp=new Employee();
					emp.setName(null);
					emp.setEmpid(0);
					emp.setSalary(0.0f);
			}
		}
	

		


	}
}


























