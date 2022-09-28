package org.tnsindia.userinput;

import java.util.Scanner;
//program on user-input for Integer data-types

public class DemoOnInteger {
	public static void main(String[] args) {
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value for x = ");
		int x=s.nextInt();
		System.out.print("Result =");
		System.out.println(x);
	}
}
