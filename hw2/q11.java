package com.revature.hw2;

//Objective:Write a program that would access two float-variables
//from a class that exists in another package. 
//Note, you will need to create two packages to demonstrate the solution. 

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		com.revature.q11.q11p2 myNums = new com.revature.q11.q11p2();
		
		System.out.println(myNums.getDb1());
		System.out.println(myNums.getDb2());
	}

}
