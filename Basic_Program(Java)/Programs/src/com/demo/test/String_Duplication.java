package com.demo.test;

import java.util.HashSet;

public class String_Duplication {
	
		public static void main(String[] args) {
			

			  String[] str = {"apple","mango","shubham" ,"banana", "apple","shubham","orange","mango","grapes"};
			     
			         System.out.println("All Strings :");
			     for(int i=0; i<str.length;i++)
			     {
			         System.out.println(str[i]);
			     }
			    System.out.println("=========================");
			    System.out.println("Duplicates Strings :");


			     for(int i=0; i<str.length;i++)
			     { 
			         for(int j=i+1; j<str.length;j++)
			         {
			             if(str[i].equals(str[j]))
			             {
			              System.out.println(str[i]);
			             }
			         }
			     }
			     
				 //------------------------------------------------------------

			     
			     System.out.println("=========================");
				 System.out.println("Another Way : ");
				 
				 HashSet<String> hset = new HashSet<String>();
				 HashSet<String> hset1 = new HashSet<String>();

					for (String s : str) {
						if (!hset.add(s)) {
							hset1.add(s);
						}
					}
					System.out.println("Unique : " + hset);
					System.out.println("Duplicates: " + hset1);


		}

}
