package week3.assignment;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        
                String[] words = text.split(" ");
        
        Set<String> uniqueWords = new LinkedHashSet<String>();
        
                for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        
                String result = String.join(" ", uniqueWords);
        
                System.out.println("Original Sentence: " + text);
        System.out.println("Sentence without duplicates (case insensitive): " + result);
    }
}
