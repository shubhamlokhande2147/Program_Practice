package com.demo.test;

public class Sum_of_Digits {

	public static void main(String[] args) {
		
		int number = 15;
		int sum =0;
		
		
		while(number != 0 )
		{
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		
		System.out.println("Sum of Digits " + sum);
	}
	
}
