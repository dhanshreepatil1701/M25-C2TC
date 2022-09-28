package org.tnsindia.userinput;

import java.util.Scanner;

public class DemoOnString {

	public static void main(String[] args) {
		//for user-input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string =");
		//the difference between next() and nextLine()
		/* next() will take only the first word of your sentence and 
		 * nextLine() take the complete sentence*/
		String x=s.nextLine();
		System.out.println("Result =");
		System.out.println(x);
		s.close();
	}
}
