package com.revature.hw2;

/*Objective:Write a substring method that accepts a string str and an integer idx
and returns the substring contained between 0 and idx-1 inclusive. 
 Do NOT use any of the existing substring methods in the String, 
 StringBuilder, or StringBuffer APIs. 
*/
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pluto is a planet";
		
		char[] myArray = str.toCharArray() ;
		
		for(int idx = 0; idx < myArray.length; idx++) {
			System.out.print(myArray[idx]);
		}
	}
}