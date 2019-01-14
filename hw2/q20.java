package com.revature.hw2;

/*Objective:Create a notepad file called Data.txt and enter the following:

Mickey:Mouse:35:Arizona
Hulk:Hogan:50:Virginia
Roger:Rabbit:22:California
Wonder:Woman:18:Montana
 
Write a program that would read from the file and
print it out to the screen in the following format:
 
Name: Mickey Mouse
Age: 35 years
State: Arizona State */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		String path = "src/com/revature/hw2/Data.txt";
		
		try {
			br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			
//			"Name: Mickey Mouse\r\n" + 
//					"Age: 35 years\r\n" + 
//					"State: Arizona State\r\n";
//			line.split(arg0)
			//read file until there's nothing left
			while(line != null) {
			String[] str = line.split(":");
				int x = 0;
				System.out.print("Name: " + str[x] + " ");
				x++;
				System.out.println(str[x]);
				x++;
				System.out.println("Age: " + str[x] + " year");
				x++;
				System.out.println("State: " +str[x] + " state");
				x++;
				System.out.println();
				line = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}