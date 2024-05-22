package com.demo.test;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		
		//int number = 5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to calculate it's Factorial : ");
		int number = sc.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= number; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial is " + fact);
	}
	
}
