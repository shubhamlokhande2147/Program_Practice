package com.demo.test;

public class Bubble_Sort {

      public static void main(String[] args) {
	    
    		int[] arr = {2,4,1,134,12,11,45,676,14,24,55};
    		
    		//print original array -
    		System.out.print("Original Array - ");
    		for(int i = 0; i < arr.length; i++) 
    		{
            	System.out.print(arr[i] + ",");
    		}
    		
    		//logic - 
    		for(int i = 0; i < arr.length; i++) {
    			
    			for(int j = i+1; j < arr.length; j++)
    			{
    				if(arr[i] > arr[j])
    				{
    					int temp = arr[i];
    					arr[i] = arr[j];
    					arr[j] = temp;
    				}
    			}
    		}    
    		
    		//print sorted array -
    		System.out.print("\nSorted Array - ");
    		for(int i = 0; i < arr.length; i++) 
    		{
            	System.out.print(arr[i] + ",");
    		}

    		//print greatest element in  array -
    		System.out.print("\nGreatest Element in Array - "+ arr[arr.length - 1]);

    		
   }
	
}


// bubble sort.. 
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

	

