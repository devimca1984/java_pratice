package com.study;

import java.util.Scanner;

public class FactorialNoPrg {
   // Factorial of Number using Recursion method
	/*static int factorial(int n) {
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);
		
	}*/
	public static void main(String[] args) {
		//Get input from input
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=sc.nextInt();
		//System.out.println("Factorial of number is : "+ factorial(n));
		// Looping method
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println("Factorial of number is : "+  f);
	}

}
