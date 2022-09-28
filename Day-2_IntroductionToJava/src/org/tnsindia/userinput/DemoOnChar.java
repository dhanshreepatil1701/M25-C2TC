package org.tnsindia.userinput;
//program on user input for character data-type

import java.util.Scanner;
public class DemoOnChar {
	public static void main(String[] args) {
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value of x= ");
		char x=s.next().charAt(0);
		System.out.print("Result= ");
		System.out.println(x);
		s.close();
	}
}
