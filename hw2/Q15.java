package com.revature.hw2;

/*Objective:Write a program that defines an interface having the following methods:
 *  addition, subtraction, multiplication, and division.
 *    Create a class that implements this interface and provides appropriate
 *     functionality to carry out the required operations.
 *      Hard code two operands in a test class having a main method that calls
 *       the implementing class. */

import com.revature.hw2.Q15func;

public class Q15 extends Q15func{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q15func impl = new Q15func();

		int num1 = 10, num2 = 5;
		System.out.println(num1 + " + "+ num2 +" is "+ impl.adder(num1,num2));
		System.out.println(num1 + " - "+ num2 +" is "+ impl.subtracter(num1,num2));
		System.out.println(num1 + " * "+ num2 +" is "+ impl.multiplier(num1,num2));
		System.out.println(num1 + " / "+ num2 +" is "+ impl.divider(num1,num2));
	}
}