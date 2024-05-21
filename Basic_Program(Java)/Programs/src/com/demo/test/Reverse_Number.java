package com.demo.test;

public class Reverse_Number {
	
	public static void main(String[] args) {
		
		
    	int number = 12345678;
    	
    	System.out.println("Original String : " + number);
    	
    	int reverse = 0;
    	
    	    	
    	while(number !=0 )
    	{
    	   int digit = number % 10;
    	   reverse = reverse * 10 + digit;
    	   number = number / 10;
    	}
    	
    	System.out.println("Reverse String : " + reverse);
		
	}

}
