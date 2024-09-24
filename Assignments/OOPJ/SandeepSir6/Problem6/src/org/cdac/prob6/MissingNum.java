package org.cdac.prob6;

import java.util.Scanner;

public class MissingNum {
	
		public static void main(String[] args) {
			  int[] arr=new int[] {1,2,3,4,5,6,8,9,10};
			  
			  System.out.println("Missing Number from array is:"+MissingNum.arrElement(arr,arr.length+1));
		}

		private static int arrElement(int[] arr,int n) {
			int sumNatural=(n*(n+1))/2;
			int sumArray=0;
			for(int i=0;i<arr.length;i++) {
				sumArray=sumArray+arr[i];
			}
			int MissingNum=sumNatural-sumArray;
			return MissingNum;
		}
}
