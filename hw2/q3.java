package com.revature.hw2;

//Objective: Reverse a string without using a temporary variable.
//Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.

public class q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myWord = "Kaufmann", reversed ="";
		
		for(int x = myWord.length()-1; x >= 0; x--) {
			reversed = reversed + myWord.charAt(x);
		}

		System.out.println(myWord);
		System.out.println(reversed);
	}
}
