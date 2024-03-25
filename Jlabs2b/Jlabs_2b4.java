class Jlabs_2b4
/*
Student Name: Reanielle Patrick Broas
Student ID: C00296913
 */
{
    public static void main(String args[]) 
    {
        int number1;
        int number2;
        int number3;

        System.out.println("Enter your 1st number ");
        number1 = EasyIn.getInt();
        System.out.println("Enter your 2nd number ");
        number2 = EasyIn.getInt();
        System.out.println("Enter your 3rd number ");
        number3 = EasyIn.getInt();

        int lowest;
        int middle;
        int highest;

        if (number1 <= number2 && number1 <= number3) 
        {
            lowest = number1;
            if (number2 <= number3) 
            {
                middle = number2;
                highest = number3;
            } 
            else 
            {
                middle = number3;
                highest = number2;
            }
        } 
        else if (number2 <= number1 && number2 <= number3) 
        {
            lowest = number2;
            if (number1 <= number3) 
            {
                middle = number1;
                highest = number3;
            } else 
            {
                middle = number3;
                highest = number1;
            } 
        } 
        else 
        {
            lowest = number3;
            if (number1 <= number2)
            {
                middle = number1;
                highest = number2;
            } else 
            {
                middle = number2;
                highest = number1;
            }
        }
        System.out.println("The three numbers sorted in ascending order: " + lowest + ", " + middle + ", " + highest);
    }
}
