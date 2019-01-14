package com.revature.hw2;

/*Objective:Write a program that defines an interface having the following methods:
 *  addition, subtraction, multiplication, and division.
 *    Create a class that implements this interface and provides appropriate
 *     functionality to carry out the required operations.
 *      Hard code two operands in a test class having a main method that calls
 *       the implementing class. */
public class Q15func implements Q15Interface{
	
	@Override
	public int adder(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtracter(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiplier(int num1, int num2) {
		// TODO Auto-generated method stub
		return  num1 * num2;
	}

	@Override
	public int divider(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
}