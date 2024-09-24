package org.cdac.prob3;

import java.util.Scanner;

public class MinMax {
	
	public static void acceptRecord(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
        	System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
    }

	public static void main(String[] args) {
		int[] arr=new int[5];
		acceptRecord(arr);
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Minimun value:"+min);
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum value:"+max);

	}

}
