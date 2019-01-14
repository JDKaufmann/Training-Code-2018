package com.revature.hw2;

/*Objective:Write a program that demonstrates the switch case. 
Implement the following functionalities in the cases:java 
Case 1: Find the square root of a number using the Math class method.
Case 2: Display today’s date.
Case 3: Split the following string and store it in a string array.
           	“I am learning Core Java” */


import java.util.Date;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 3;
	    Date date = new Date();
		
		switch(num) {
		case 1:
			System.out.println("The square root of 49 is " + Math.sqrt(49));
			break;
		case 2:
			System.out.println("Today's date is " + date.toString());
			break;
		case 3:
			String str1 ="I am learning";
			String str2 = "Core Java";
			System.out.println(str1 + " " +str2);
			break;
		}
	}
}