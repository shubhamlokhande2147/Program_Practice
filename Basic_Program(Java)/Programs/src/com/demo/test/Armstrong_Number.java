package com.demo.test;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int number = 153;
		int temp;
		temp = number;
		int sum = 0;

    	System.out.println("Original Number " + number);

		
		while( number > 0)
		{
			int r = number % 10;
			sum = sum + ( r * r * r);
			number = number / 10;
		}
		
    	System.out.println("Sum " + sum);
    	
    	System.out.println("============================");
    	
    	if(temp == sum)
    	{
    	  System.out.println(temp + " is Armstrong Number");	
    	}
    	else
    	{
      	  System.out.println(temp + " is Not Armstrong Number");		
    	}

	}
	
}
