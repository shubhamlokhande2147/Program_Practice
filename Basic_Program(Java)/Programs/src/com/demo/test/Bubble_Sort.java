package com.demo.test;

public class Bubble_Sort {

//      public static void main(String[] args) {
//	    
//    		int[] arr = {2,4,1,134,12,11,45,676,14,24,55};
//    		
//    		//print original array -
//    		System.out.print("Original Array - ");
//    		for(int i = 0; i < arr.length; i++) 
//    		{
//            	System.out.print(arr[i] + ",");
//    		}
//    		
//    		//logic - 
//    		for(int i = 0; i < arr.length; i++) {
//    			
//    			for(int j = i+1; j < arr.length; j++)
//    			{
//    				if(arr[i] > arr[j])
//    				{
//    					int temp = arr[i];
//    					arr[i] = arr[j];
//    					arr[j] = temp;
//    				}
//    			}
//    		}    
//    		
//    		//print sorted array -
//    		System.out.print("\nSorted Array - ");
//    		for(int i = 0; i < arr.length; i++) 
//    		{
//            	System.out.print(arr[i] + ",");
//    		}
//    		
//   }
	
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

// ubble sort.. 
//if i don't want to sort last element then what modification i need to do? 
//last element is not sorted , then second for loop length - 1.

//for(int i = 0; i < arr.length; i++) {
//	
//	for(int j = i+1; j < arr.length - 1; j++)
//	{
//		if(arr[i] > arr[j])
//		{
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
//	}
//}    

	

