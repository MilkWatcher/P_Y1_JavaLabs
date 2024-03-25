import java.util.Arrays;
class Jlab_71
{
    
    // Method to check if a number is even
    public static boolean isEven(int num) 
    {
        return num % 2 == 0;
    }
    
    public static void main(String[] args) 
    {
        // Read the array of integers
        int[] array = readArray();
        
        // Initialize counters for odd and even numbers
        int oddCount = 0;
        int evenCount = 0;
        
        // Iterate through each element of the array
        for (int num : array) 
        {
            // Check if the number is even using the isEven() method
            if (isEven(num)) 
            {
                evenCount++; // Increment even count if the number is even
            } else 
            {
                oddCount++; // Increment odd count if the number is odd
            }
        }
        
        // Print the array and the counts of odd and even numbers
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
    }
    
    // Method to read an array of integers from the user
    public static int[] readArray() 
    {
        System.out.print("Enter the size of the array: ");
        int size = EasyIn.getInt(); // Read the size of the array
        
        // Create an array with the specified size
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        // Read each element of the array from the user
        for (int i = 0; i < size; i++) 
        {
            array[i] = EasyIn.getInt();
        }
        
        // Return the array
        return array;
    }
}
