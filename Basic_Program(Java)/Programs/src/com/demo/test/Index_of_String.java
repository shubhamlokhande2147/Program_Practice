package com.demo.test;

public class Index_of_String {
	
	 public static int firstOccurrence(String str, char letter) {
	        // Loop through the string using its index
	        for (int i = 0; i < str.length(); i++) {
	            // Check if the current character is the target letter
	            if (str.charAt(i) == letter) {
	                return i;
	            }
	        }
	        // If the letter is not found, return -1
	        return -1;
	    }

	    public static void main(String[] args) {
	        String str = "hello world";
	        char letter = 'o';
	        int result = firstOccurrence(str, letter);
	        System.out.println("The first occurrence of '" + letter + "' is at index: " + result);
	    }
   
}


