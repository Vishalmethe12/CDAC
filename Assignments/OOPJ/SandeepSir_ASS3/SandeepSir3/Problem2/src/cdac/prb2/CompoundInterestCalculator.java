package cdac.prb2;

import java.util.Scanner;

public class CompoundInterestCalculator {
	float init_amt;
	float annual_interest_rate;
	int compounded_per_year;
	int duration_year;

	public void Accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial investment amount:");
		init_amt = sc.nextFloat();

		System.out.println("Enter annual interest rate:");
		annual_interest_rate = sc.nextFloat();

		System.out.println("Enter number of times the interest is compounded per year:");
		compounded_per_year = sc.nextInt();
		
		System.out.println("Enter the duration year");
		duration_year=sc.nextInt();
		sc.close();
	}

	public void Calculate() {
	
			float futureValue = init_amt * (float)Math.pow((1 + annual_interest_rate / compounded_per_year), (compounded_per_year * duration_year));

			float totalInterest = futureValue - init_amt;
			
			System.out.println("Future value will be " +futureValue);
			System.out.println("Total interest earned " +totalInterest);
		
	}
	
	

}
