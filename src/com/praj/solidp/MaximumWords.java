package com.praj.solidp;

import java.util.HashMap;

public class MaximumWords {
    public static void main(String[] args) {
        String input = "Prajwal Kumar Samal Prajwal Kumar Samal Samal";
        String tWord = "Prajwal";

        String[]  words = input.split("\\s+");
        HashMap<String , Integer> wordCount = new HashMap<>();

        int tCount =0;
        String maxWord = "";
        int maxCount = 0;

        for(String word : words) {
            word = word.toLowerCase();
            wordCount.put(word , wordCount.getOrDefault(word, 0)+ 1);

            if(wordCount.get(word) > maxCount) {
                maxCount = wordCount.get(word);
                maxWord = word;
            }

            if(word.equalsIgnoreCase(tWord)) {
                tCount++;
            }


        }
        System.out.println("Count of the word is: "+tWord +" : "+ tCount);
        System.out.println("Repeted words are : "+ maxWord+ " count: "+ maxCount);
    }
}
