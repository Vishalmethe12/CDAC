package org.cdac.prob8;

import java.util.Scanner;

public class ArrayFeildGetSet {
	private int[] arr;
	private int size;
	
	public ArrayFeildGetSet(){
	
		}
	
	public int getSize() {
		
		return size;
		}
	

	public void setSize(int size) {
		this.size = size;
		this.arr=new int[size];
	}

	public void getArr() {
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

	public void setArr() {
		try(Scanner sc=new Scanner(System.in)){
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element: ");
		    arr[i] = sc.nextInt();
			}
		}
	}

	public static void main(String[] args) {
	
		ArrayFeildGetSet a=new ArrayFeildGetSet();
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the size:");
			int size=sc.nextInt();
			a.setSize(size);
			
			a.setArr();
			a.getArr();

	}

}
}
