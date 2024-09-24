package org.cdac.prob7;

import java.util.Scanner;

public class ArrayField {
	private int size;
	private int[] arr=new int[size];
	
	public ArrayField(){
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
	}
	
	static Scanner sc=new Scanner(System.in);

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
	
	
	public static void main(String[] args) {
		 
		  System.out.print("Enter the size of array:");
		  int size=sc.nextInt();
		  int[] arr=new int[size];
		  
		  ArrayField.acceptRecord(arr);
		  ArrayField.printRecord(arr);
		  
		  
	}
}
