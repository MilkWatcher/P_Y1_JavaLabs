class Jlab_32
/*
Student Name: Reanielle Patrick Broas
Student ID: C00296913
 */
{
    public static void main(String args[]) 
    {
        int sumNumber = 0; // Initialize the sum to zero.
        int valueNum;      // Declare a variable for user input.

        System.out.println("Enter numbers; enter 0 to stop."); 
        do 
        {
            System.out.print("Enter a number: ");
            valueNum = EasyIn.getInt();

            if (valueNum != 0) // If the entered number is not zero...
            {
                sumNumber += valueNum; // ...add it to the sum.
            }
        } 
        while (valueNum != 0); // Continue until zero is entered.
        System.out.println("Sum of numbers: " + sumNumber);
    }
}
