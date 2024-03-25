class Jlab_51
/*
Student Name: Reanielle Broas
Student ID: C00296913
Write a program which will input a string from the keyboard, and output the number 
of separate words, where a word is one or more characters separated by spaces. Your program should only count as words groups of characters in the ranges A..Z and a..z

1) Ask user to input string
User inputs string
2) Count the number of spaces between words (word > 1 char)
 */
 {
    public static void main(String[] args) 
    {

        System.out.print("Enter a string: ");
        
        String inputString = EasyIn.getString();
        
        // Call the countWords method to calculate and display the number of words
        int wordCount = countWords(inputString);

        System.out.println("Number of words: " + wordCount);
    }

    // Method to count the number of words in a given string
    private static int countWords(String input) 
    {
        int wordCount = 0;
        // going through each character in the input string
        for (int i = 0; i < input.length(); i++) 
        {
            // checking if the current character is in the range A..Z or a..z
            if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) 
            {
                wordCount++;

                // skip th consecutive characters of the same word
                while (i < input.length() - 1 && ((input.charAt(i + 1) >= 'A' && input.charAt(i + 1) <= 'Z') || (input.charAt(i + 1) >= 'a' && input.charAt(i + 1) <= 'z'))) 
                {
                    i++;
                }
            }
        }
        return wordCount;
    }
}
