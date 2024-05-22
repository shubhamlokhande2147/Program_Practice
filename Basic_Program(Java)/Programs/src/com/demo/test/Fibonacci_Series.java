package com.demo.test;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int number = 5;
		
		int first = 0;
		int second = 1;
		
		for(int i=0; i<= number; i++)
		{
			System.out.print(first + ",");
			int next = first + second;
			
			first = second;
			second = next;
		}
	}
}
