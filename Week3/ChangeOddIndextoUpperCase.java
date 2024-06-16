package week3.assignment;

public class ChangeOddIndextoUpperCase {
    public static void main(String[] args) {
        // Input string
        String test = "changeme";
        
        // Convert the string to a character array
        char[] charArray = test.toCharArray();
        
        // Loop through the character array from end to start
        for (int i = charArray.length - 1; i >= 0; i--) {
            // Check if the index is odd
            if (i % 2 != 0) {
                // Change the character to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        
        // Convert the character array back to a string
        String result = new String(charArray);
        
        // Print the result
        System.out.println("Original String: " + test);
        System.out.println("Modified String: " + result);
    }

	
	
	
	
}