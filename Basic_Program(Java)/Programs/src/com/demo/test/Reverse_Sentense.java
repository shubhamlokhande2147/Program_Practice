package com.demo.test;

public class Reverse_Sentense {
	
	public static void main(String[] args) {
		
		String str = "Common Campus Placement Program";
		
		System.out.println("Original String = " + str);
		
		String[] words = str.split(" " );
		
		System.out.print("Reverse String = " );
		
		for(int i=words.length - 1 ; i >= 0; i--)
		{
		  System.out.print(words[i] + " ");
		}

	}

}
