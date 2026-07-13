package com.study;

import java.util.Scanner;

public class ArmstrongNoPrg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num=sc.nextInt();
		int actual_num=num;
		double sum=0;
		int count_digit=String.valueOf(num).length(); // no.of digits in number
		while(num!=0)
		{
			int last_digit=num%10;
			sum=sum+Math.pow(last_digit, count_digit);//calculate sum of power of digits
			num=num/10;
		}
		if(sum==actual_num) {
			System.out.println(actual_num + " : is an Armstrong no");
			
		}
		else
		{
			System.out.println(actual_num + " : is Not an Armstrong no");
		}
		

	}

}
