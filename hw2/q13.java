package com.revature.hw2;

/*Objective:Display the triangle on the console as follows using any type of loop.
Do NOT use a simple group of print statements to accomplish this.
0
1 0
0 1 0
1 0 1 0 */


public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int z = 1, a = 0;
			int arr[]= {0,1,0,0,1,0,1,0,1,0};
			for(int x = 0; x < 4; x++) {
				
				for(int y = 0; y < z; y++) {
					System.out.print(arr[a]);
					a++;
				}
				z++;
				System.out.println();
			}
	}
}