package com.revature.hw2;

/*Objective:Write a program having a concrete subclass
 *  that inherits three abstract methods from a superclass.
 *Provide the following three implementations in the subclass
	corresponding to the abstract methods in the superclass:

1. Check for uppercase characters in a string, and return
 ‘true’ or ‘false’ depending if any are found.
2. Convert all of the lower case characters to uppercase
 in the input string, and return the result.
3. Convert the input string to integer and add 10, output the result to the console.
*/

public class q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q18p2 impl = new q18p2();
	
		String myString = "This is a TEST";
		String myNumString = "70";
		System.out.println("myString has CAPITAL letters: " + impl.upperCheck(myString));
		System.out.println("myString in lowercase: "+ impl.lowerConvert(myString));
		System.out.println("myString as a number: "+ impl.intConverter(myNumString));
	}
}
