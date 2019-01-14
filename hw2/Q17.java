package com.revature.hw2;

/*Objective: Write a program that calculates the simple interest on the principal,
rate of interest and number of years provided by the user.
Enter principal, rate and time through the console using the Scanner class.
Interest = Principal* Rate* Time*/


import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int principal, rate, time, total = 0;
		System.out.println("Please enter the Principal.");
		principal = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter the Rate.");
		rate = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter the Time.");
		time = Integer.parseInt(sc.nextLine());
				
		total = principal * rate * time;

		System.out.println("The interest of the values inputted is " + total);
	}
}