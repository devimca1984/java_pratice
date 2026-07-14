package com.study;

public class Even1to100_Print_Count {

	public static void main(String[] args) {
		System.out.println("To print 1 to 100 numbers: ");
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
				count=count+1;
				
			}
		}
		System.out.println();
		System.out.println("Count of 1 to 100 of Even numbers  :"+count);
	}

}
