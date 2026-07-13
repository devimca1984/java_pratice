package com.study;

import java.util.Scanner;

public class PalindromNoPrg {
   public static void main(String[] args) {
	   //Enter user input
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter the number : ");
	   int num=sc.nextInt();
	   int actual_num=num; // stores orinigal number 
	   int reverse_num=0;
	   while(num!=0)
	   {
		   int last_digit=num%10;
		   reverse_num=reverse_num*10+last_digit;
		   num=num/10;
	   }
	   System.out.println("Reverse digit " + reverse_num);
	   if (actual_num==reverse_num)
	   {
		   
		   System.out.println(" The given no is Palindrome number ");
	   }
	   else
	   {
		   System.out.println(" The given no is not Palindrome number ");
	   }
   }
    

}
