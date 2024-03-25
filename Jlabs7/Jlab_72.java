import java.util.Arrays;
class Jlab_72 
{
    
    public static void main(String[] args) 
    {
        // Read the array of integers
        int[] array = readArray();
        
        // Find the highest and lowest numbers in the array
        int min = findMin(array);
        int max = findMax(array);
        
        // Print the array and the highest and lowest numbers
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
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
    
    // Method to find the minimum number in the array
    public static int findMin(int[] array) 
    {
        int min = array[0]; // Assume the first element is the minimum
        
        // Iterate through each element of the array
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] < min) 
            {
                min = array[i]; // Update the minimum if a smaller number is found
            }
        }
        
        // Return the minimum number
        return min;
    }
    
    // Method to find the maximum number in the array
    public static int findMax(int[] array) 
    {
        int max = array[0]; // Assume the first element is the maximum
        
        // Iterate through each element of the array
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > max) 
            {
                max = array[i]; // Update the maximum if a larger number is found
            }
        }
        
        // Return the maximum number
        return max;
    }
}
