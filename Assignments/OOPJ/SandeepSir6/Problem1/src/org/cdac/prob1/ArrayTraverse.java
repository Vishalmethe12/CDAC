package org.cdac.prob1;

import java.util.Scanner;

public class ArrayTraverse {
	
	public static void printRecord(int[] arr) {
		for(int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	private static void accetpRecord(int[] arr) {
		try(Scanner sc=new Scanner(System.in)){
			for(int i=0;i<arr.length;i++) {
				System.out.print("Enter the element: ");
				arr[i]=sc.nextInt();
			}
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[5];
		ArrayTraverse.printRecord(arr);
		ArrayTraverse.accetpRecord(arr);
		ArrayTraverse.printRecord(arr);

	}
	
}
