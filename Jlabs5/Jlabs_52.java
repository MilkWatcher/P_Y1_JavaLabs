class Jlabs_52
/*
Modify the program at (1) so that it outputs the words input by the user in reverse order 
(“This word is 3 chars”   becomes “chars 3 is word This”)
 */
{
public static void main(String[] args) {

    System.out.print("Enter a string: ");
    String inputString = EasyIn.getString();
    
    // ReverseWords method to process and display the reversed words
    String reversedWords = reverseWords(inputString);
    System.out.println("Reversed words: " + reversedWords);
}

// Define a method to reverse the order of words in a given string without using arrays
private static String reverseWords(String input) {
    // Create a StringBuilder to build the reversed string
    StringBuilder reversedString = new StringBuilder();

    // Initialize variables to track the start and end positions of each word
    int end = input.length() - 1;
    int start;

    // Iterate through the input string from right to left
    for (int i = input.length() - 1; i >= 0; i--) {
        // Find the end position of the current word
        while (i >= 0 && input.charAt(i) == ' ') {
            i--;
            end = i;
        }

        // Find the start position of the current word
        while (i >= 0 && input.charAt(i) != ' ') {
            i--;
        }
        start = i + 1;

        // Append the current word to the StringBuilder
        reversedString.append(input, start, end + 1);

        // Add a space between words, except for the last word
        if (start > 0) {
            reversedString.append(" ");
        }

        // Set the end position for the next iteration
        end = i;
    }

    // Return the final reversed string
    return reversedString.toString();
}
}