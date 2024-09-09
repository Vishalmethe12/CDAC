package cda.prob3;

import java.util.Scanner;

public class BMITracker {

	float weight;
	float height;
	float BMI;
	String Status;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Weight(in kg):");
		weight = sc.nextFloat();

		System.out.print("Enter the Height(in m):");
		height = sc.nextFloat();

		sc.close();

	}

	public void calculateBMI() {
		BMI = weight / (height * height);
	}

	public void classifyBMI() {
		if (BMI < 18.5) {
			Status = "Underweight";
		} else if (18.5 <= BMI && BMI < 24.9) {
			Status = "Normal weight";
		} else if (25 <= BMI && BMI < 29.9) {
			Status = "Overweight";
		} else {
			Status = "Obese";
		}

	}

	public void printRecord() {
		System.out.println("BMI is " + BMI);
		System.out.println("It is classified as: " + Status);
	}

}
