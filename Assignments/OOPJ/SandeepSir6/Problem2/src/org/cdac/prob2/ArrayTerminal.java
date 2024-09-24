package org.cdac.prob2;
import java.util.Scanner;

public class ArrayTerminal {
	
		public static void acceptRecord(int[] arr) {
	        Scanner sc = new Scanner(System.in);
	        for (int i = 0; i < arr.length; i++) {
	        	System.out.print("Enter element: ");
	            arr[i] = sc.nextInt();
	        }
	    }
		
		public static void printRecord(int[] arr) {
		        System.out.println("Array elements are:");
		        for (int num : arr) {
		            System.out.print(num+" ");
		        }
		    }
		
	    public static void main(String[] args){
	        int[] arr = new int[5]; 

	        acceptRecord(arr);      
	        printRecord(arr);       
	    }

	}

