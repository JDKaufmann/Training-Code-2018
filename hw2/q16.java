package com.revature.hw2;

//Objective:Write a program to display the number of characters for a string input.
//The string should be entered as a command line argument using
//(String [ ] args) or using the scanner class.

import java.util.Scanner;

public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		System.out.println("Please enter some words.");
//		String line = sc.nextLine();
		
		int count = args[0].length();
		System.out.println("This string has "+count+" characters.");
		}
}