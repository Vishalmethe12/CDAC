package org.cdac.prob4;

import java.util.Scanner;

public class RmvDuplicate{
	
	public static void acceptRecord(int[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter element: ");
			    arr[i] = sc.nextInt();
			}
		}
    }
	
	public static void printRecord(int[] arr) {
	        System.out.println("Array elements are:");
	        for (int num : arr) {
	            System.out.print(num+" ");
	        }
	    }
	
	
	private static void dupli(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j)
					break;
				if()
			}
		}
	}
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int size=sc.nextInt();
		  int[] arr=new int[size];
		  
		  RmvDuplicate.acceptRecord(arr);
		  RmvDuplicate.printRecord(arr);
		  RmvDuplicate.dupli(arr);
		
		
		
	}

	

}
