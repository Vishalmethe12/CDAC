package cdac.Prob1;

import java.util.Scanner;

public class LoanAmortizationCalculator {
	float amt;
	float rate;
	int year;

	public void Accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the loan amount:");
		amt = sc.nextFloat();

		System.out.print("Enter the annual interest rate:");
		rate = sc.nextFloat();

		System.out.print("Enter the loan terms(in year):");
		year = sc.nextInt();
		sc.close();

	}

	public void Calculate() {
		double monthlyInterestRate = rate / 12 / 100;
		float numberOfMonths = (float) year * 12;
		float monthlyPayment = (float) (amt * (monthlyInterestRate * Math.pow(monthlyInterestRate + 1, numberOfMonths))
				/ (Math.pow(monthlyInterestRate + 1, numberOfMonths) - 1));

		System.out.println("Monthly amout PAID is :" + monthlyPayment);
		System.out.println("Total amout PAID is :" + monthlyPayment * numberOfMonths);

	}

}
