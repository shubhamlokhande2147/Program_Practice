package com.demo.test;

public class String_Frequency_Array {

    public static void main(String[] args) {
        
        String str1 = "Shubham";
        String str2 = "Smkbr";
        
        // Determine the length of the longer string to size the array appropriately
        int maxLength = str1.length();
        int[] str3 = new int[maxLength];

        // Compare corresponding characters
        for(int i = 0; i < maxLength; i++) {
            if (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
                str3[i] = 1;
            } else {
                str3[i] = 0;
            }
        }
        
        // Print the results
        for(int i = 0; i < maxLength; i++) {
            System.out.println("Position " + i + ": " + str3[i]);
        }
    }
}
