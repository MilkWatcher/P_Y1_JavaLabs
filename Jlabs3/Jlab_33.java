class Jlab_33
/*
Student Name: Reanielle Broas
Student ID: C00296913

Pseudocode:
1. Initialize variables:
   - number = 0 (temporary storage for user input)
   - index = 0 (to keep track of the sequence number)
   - firstOccurrence = 0 (to store the index of the first occurrence of 12)
   - lastOccurrence = 0 (to store the index of the last occurrence of 12)

2. Display a message: "Enter a list of integer values (0 to stop):"

3. Start a loop that continues until the user enters 0:
   a. Prompt the user for input: "Enter a number:"
   b. Read an integer value from the user and store it in the 'number' variable.
   c. Increment the 'index' to keep track of the sequence number.

   d. If 'number' is equal to 12:
      - If 'firstOccurrence' is 0 (indicating the first occurrence has not been found yet):
        -- Set 'firstOccurrence' to 'index' (store the index of the first occurrence).
      - Update 'lastOccurrence' to the current 'index' (update the index of the last occurrence).

4. End the loop when the user enters 0.

5. If 'firstOccurrence' is still 0:
   - Display: "Index values of 0 (zero) for the number 12: Number 12 not found."
   - This means the number 12 was not found in the input.

6. Otherwise:
   - Display: "Index values for the number 12: First Occurrence - 'firstOccurrence', Last Occurrence - 'lastOccurrence'"
   - This shows the indices of the first and last occurrences of the number 12 in the input.

7. End of the program.
*/

{
    public static void main(String args[]) 
    {
        int number;
        int indexValue = 0; // Initialize the index to 0 (zero).
        int firstOccurrence = 0; // Initialize the first occurrence index to 0 (zero).
        int lastOccurrence = 0; // Initialize the last occurrence index to 0 (zero).

        System.out.println("Enter a list of integer values (0 to stop):");

        do 
        {
            System.out.print("Enter a number: ");
            number = EasyIn.getInt();
            indexValue++; // Increment the index with each input.

            if (number == 12) 
            {
                if (firstOccurrence == 0) 
                {
                    firstOccurrence = indexValue; // Set the first occurrence index.
                }
                lastOccurrence = indexValue; // Update the last occurrence index.
            }
        } 
        while (number != 0);

        if (firstOccurrence == 0) 
        {
            System.out.println("Index values of 0 for the number 12: Number 12 not found.");
        } 
        else 
        {
            System.out.println("Index values for the number 12: First Occurrence - " + firstOccurrence + ", Last Occurrence - " + lastOccurrence);
        }
    }
}
