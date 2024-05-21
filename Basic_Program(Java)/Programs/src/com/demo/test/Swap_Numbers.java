package com.demo.test;

public class Swap_Numbers {
	
    public static void main(String[] args) {
		 
    	int a = 12345;
    	int b = 78910;
    	
    	System.out.println("First Number : " + a + "  \nSecond Number : "+ b);
    	
    	a = a + b;
    	b = a - b;
    	a = a - b;
    	
    	System.out.println("==============================");

    	System.out.println("First Number : " + a + "  \nSecond Number : "+ b);

    	
	}
}
