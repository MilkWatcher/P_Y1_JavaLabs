class Jlabs_53
/*
 * Modify the program so that it outputs the number of words in the users input, with the average, min and max characters in the word.
 */
{
    public static void main(String[] args) 
    {

        System.out.print("Enter a string: ");
        String inputString = EasyIn.getString();
        
        //method to calculate the average, min and max
        calculateStats(inputString);
    }
    
    private static void calculateStats(String input) 
    {
        //tracking wordcount
        int wordCount = 0;
        int totalWordLength = 0;
        int minWordLength = Integer.MAX_VALUE;
        int maxWordLength = Integer.MIN_VALUE;

        //track the start and end positions of each word
        int end = input.length() - 1;
        int start;

        //go through the input string from right to left
        for (int i = input.length() - 1; i >= 0; i--) 
        {
            //find the end position of the current word
            while (i >= 0 && input.charAt(i) == ' ') 
            {
                i--;
                end = i;
            }

            //find the start position of the current word
            while (i >= 0 && input.charAt(i) != ' ') 
            {
                i--;
            }
            start = i + 1;

            //calculating the length of the word
            int wordLength = end - start + 1;

            //updating word count, total word length, minimum and maximum word length
            wordCount++;
            totalWordLength += wordLength;
            minWordLength = Math.min(minWordLength, wordLength);
            maxWordLength = Math.max(maxWordLength, wordLength);

            //set the end position for the next iteration
            end = i;
        }

        //calculate the average word length
        double averageWordLength = (double) totalWordLength / wordCount;

        System.out.println("Number of words: " + wordCount);
        System.out.println("Average word length: " + averageWordLength);
        System.out.println("Minimum word length: " + minWordLength);
        System.out.println("Maximum word length: " + maxWordLength);
    }
}
