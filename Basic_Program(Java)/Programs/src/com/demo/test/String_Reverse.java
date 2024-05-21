package com.demo.test;

public class String_Reverse {

	    public static void main(String[] args) {
			
	    	String str = "Shubham";
	    	
	    	System.out.println("Original String : " + str);
	    	
	    	String reverse = "";
	    	char st=' ';
	    	
	    	for(int i=0; i<str.length(); i++)
	    	{
	    		st = str.charAt(i);
	    		reverse = st + reverse;
	    	}
	    	
	    	System.out.println("Reverse String : " + reverse);

		}
	
}
