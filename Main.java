/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Java Program to Convert Integer Values into Binary

import java.io.*;

public class GFG {

	static void printBinary(int[] binary, int id)
	{
		for (int i = id - 1; i >= 0; i--)
			System.out.print(binary[i] + "");
	}

	public static void decimalToBinary(int num)
	{
		
		int[] binary = new int[35];
		int id = 0;

		/
		while (num > 0) {
			binary[id++] = num % 2;
			num = num / 2;
		}

	
		printBinary(binary, id);
	}

	// Main Driver Code
	public static void main(String[] args)
	{
	
		int num = 35;

		decimalToBinary(num);
	}
}
