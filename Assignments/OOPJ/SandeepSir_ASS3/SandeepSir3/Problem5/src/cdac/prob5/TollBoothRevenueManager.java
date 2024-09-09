package cdac.prob5;

import java.util.Scanner;

public class TollBoothRevenueManager {
	
	private int num_Car;
	private int num_Truck;
	private int num_Motorcycle;
	private int rate_Car;
	private int rate_Truck;
	private int rate_Motorcycle;
	private int Rev_Car;
	private int Rev_Truck;
	private int Rev_Motorcycle;
		

	Scanner sc=new Scanner(System.in);
	public void setTollRates() {
		
		System.out.println("Set toll rates for vehicle types Car:");
		rate_Car=sc.nextInt();
		
		System.out.println("Set toll rates for vehicle types Truck:");
		rate_Truck=sc.nextInt();
				
		System.out.println("Set toll rates for vehicle types Motorcycle:");
		rate_Motorcycle=sc.nextInt();
		
	}
	
	public void acceptRecord() {
		
		System.out.println("Enter the number of cars passed:");
		num_Car=sc.nextInt();
		
		System.out.println("Enter the number of trucks passed:");
		num_Truck=sc.nextInt();
		
		System.out.println("Enter the number of motorcycle passed:");
		num_Motorcycle=sc.nextInt();
		
	}
	
	public void calculateRevenue() {
		Rev_Car=num_Car*rate_Car;
		Rev_Truck=num_Truck*rate_Truck;
		Rev_Motorcycle=num_Motorcycle*rate_Motorcycle;
		
	}
	
	public void printRecord(){
		System.out.println("Total Number of Vehicles:" +(num_Car+num_Motorcycle+num_Truck));
		System.out.println("Total Revenue of Vehicles:" + (Rev_Car+Rev_Motorcycle+Rev_Truck));
	}

}
