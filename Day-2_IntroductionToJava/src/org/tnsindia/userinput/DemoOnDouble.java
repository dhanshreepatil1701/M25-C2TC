package org.tnsindia.userinput;
//program on user input for double data-type

import java.util.Scanner;
public class DemoOnDouble {
	public static void main(String[] args) {
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x= ");
		double x=s.nextInt();
		System.out.print("Result =");
		System.out.println(x);
		s.close();
	}
}
