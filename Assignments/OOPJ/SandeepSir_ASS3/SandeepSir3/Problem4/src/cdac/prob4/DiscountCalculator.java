package cdac.prob4;

import java.util.Scanner;

public class DiscountCalculator {

	float OG_Price;
	float discountRate;
	float discountAmount;
	float finalPrice;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the original price:");
		OG_Price = sc.nextFloat();

		System.out.print("Enter the discount rate:");
		discountRate = sc.nextFloat();

		sc.close();
	}

	public void calculateDiscount() {
		discountAmount = OG_Price * (discountRate / 100);
		finalPrice = OG_Price - discountAmount;
	}
	
	public void printRecord() {
		System.out.println("Discount amount is: " + discountAmount);
		System.out.println("Its final price is: " + finalPrice);
	}
}
