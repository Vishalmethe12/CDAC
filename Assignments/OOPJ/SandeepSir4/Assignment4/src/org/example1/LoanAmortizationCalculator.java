package org.example1;

import java.util.Scanner;

class Loan {
	private double principal;
	private double i; 
	private int y; 
	public double getPrincipal() {
		return principal;
	}

	public double getAnnualInterestRate() {
		return i;
	}

	public int getLoanTermInYears() {
		return y;
	}

	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public void setAnnualInterestRate(double i) {
		this.i = i;
	}

	public void setLoanTermInYears(int y) {
		this.y = y;
	}

	public void acceptRecord() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the Loan amount: ");
			setPrincipal(sc.nextDouble());

			System.out.print("Enter the annual interest rate: ");
			setAnnualInterestRate(sc.nextDouble());

			System.out.print("Enter the term of loan in years: ");
			setLoanTermInYears(sc.nextInt());
		}
	}

	public double calculateMonthlyPayment() {
		double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;
		double numberOfMonths = getLoanTermInYears() * 12;

		return getPrincipal() * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
				/ (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	}

	
	public void printRecord() {
		double monthlyPayment = calculateMonthlyPayment();
		double totalPayment = monthlyPayment * getLoanTermInYears() * 12;

		System.out.println("Monthly Payment: ₹" + String.format("%.2f", monthlyPayment));
		System.out.println("Total Payment: ₹" + String.format("%.2f", totalPayment));
	}
}

	public class LoanAmortizationCalculator {
		public static void main(String[] args) {
			Loan ref = new Loan();
			ref.acceptRecord();
			ref.printRecord();
		}
	}
