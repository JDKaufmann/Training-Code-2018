package com.revature.hw2;

//Objective: Write a program to determine if an integer is even
//without using the modulus operator (%)

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7;
		
		if ((x & 1) == 0)
			System.out.println("x is even");
		else
			System.out.println("x is odd");
	}
}