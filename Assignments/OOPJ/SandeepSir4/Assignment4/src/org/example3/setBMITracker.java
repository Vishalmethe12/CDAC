package org.example3;


import java.util.Scanner;

class BMI{
	float weight;
	float height;
	float BMI;
	
	
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getBMI() {
		return (getWeight() / (getHeight() * getHeight()));
	}
	public void setBMI(float bMI) {
		BMI = bMI;
	}
	public void acceptRecord(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the weight in (kg) :    ");
	setWeight(sc.nextFloat());
	System.out.print("Enter the height in (meter) :       ");
	setHeight(sc.nextFloat());
	sc.close();
	}
   	
   public void classifyBMI() {
   	
   	
   	if (BMI < 18.5)
			System.out.println("You Are Underweignt    :( ");
			
		else if (BMI>18.5 && BMI<24.9)
			System.out.println("You Are Normal-Weighted :) ");
		
		else if (BMI>=25)
			System.out.println("You Are over-weignt     :( ");
   	
   }
   public void printRecord() {
   	float w = getWeight();
   	float h= getHeight();
   	float bmi = getBMI();
   	System.out.println("Weight (kg)       :   "+w);
   	System.out.println("height (meter)    :  " +h);
   	System.out.println("BMI is            :  "+bmi);
   	
   	
   }
	
}

public class setBMITracker {

	public static void main(String[] args) {
		BMI bm = new BMI();
		bm.acceptRecord();
		bm.classifyBMI();
		bm.printRecord();
		
	}

}



