package com.demo.test;

public class Frequency_Characters {

	public static void main(String[] args) {
		
		  String original = "shubham";

          // Iterate through each character in the string
          for (char c = 'a'; c <= 'z'; c++) {
              int count = 0;
              // Count the occurrences of the current character
              for (int i = 0; i < original.length(); i++) {
                  if (original.charAt(i) == c) {
                      count++;
                  }
              }
              // Print the character and its frequency if it occurs at least once
              if (count > 0) {
                  System.out.println(c + "=" + count);
              }
          }
	}
	
}
