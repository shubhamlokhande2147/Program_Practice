package com.demo.test;

public class Prime_Number_Check {

	public static void main(String[] args) {
		
		int number = 2;
		
		if( number <= 1)
		{
			System.out.println(number + " is Prime Number");
			return;
		}

		boolean flag = true;
		
		for(int i = 0; i < number/2; i++)
		{
			if(number % 2 == 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println(number + " is Prime Number");
		}
		else
		{
			System.out.println(number + " is Not Prime Number");
		}
	}
	
}
