package com.demo.test;

import java.io.*;

public class ModifyString {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\shubh\\OneDrive\\Desktop\\input.txt";
        String outputFileName = "C:\\Users\\shubh\\OneDrive\\Desktop\\output.txt";

        // Print file paths for debugging
        System.out.println("Input File Path: " + inputFileName);
        System.out.println("Output File Path: " + outputFileName);
        
        try {
            // Verify the input file exists
            File inputFile = new File(inputFileName);
            if (!inputFile.exists()) {
                System.out.println("Input file not found: " + inputFileName);
                return;
            }

            // Read input from the file
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String input = reader.readLine();
            reader.close();
            
            // Process the input string
            String output = replaceThirdVowelWithX(input);
            
            // Write the output to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write(output);
            writer.close();
            
            // Print the output to console
            System.out.println("Processed Output: " + output);
            System.out.println("Processing completed. Check output.txt for results.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static String replaceThirdVowelWithX(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        String vowels = "abeiout";
        
        for (String word : words) {
            StringBuilder modifiedWord = new StringBuilder(word);
            int vowelCount = 0;
            for (int i = 0; i < modifiedWord.length(); i++) {
                char currentChar = modifiedWord.charAt(i);
                if (vowels.indexOf(currentChar) != -1) {
                    vowelCount++;
                    if (vowelCount % 3 == 0) {
                        modifiedWord.setCharAt(i, 'X');
                    }
                }
            }
            result.append(modifiedWord).append(" ");
        }
        
        return result.toString().trim();
    }
}

