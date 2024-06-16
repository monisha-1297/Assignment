package week3.assignment;

public class ReveseOddString {
    public static void main(String[] args) {
        String test = "I am a software tester";
        
        
        String[] words = test.split("\\s+");
        
       
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // odd position
                words[i] = reverseString(words[i]);
            }
        }
        
       
        String result = String.join(" ", words);
        
        
        System.out.println("Original String: " + test);
        System.out.println("Modified String: " + result);
    }
    
    // Helper method to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
