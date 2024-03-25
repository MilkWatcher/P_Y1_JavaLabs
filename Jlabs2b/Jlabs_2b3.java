class Jlab_2b3
/*
Student Name: Reanielle Patrick Broas
Student ID: C00296913
 */
{
    public static void main(String[] args)

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

        if(number1<=number2&&number1<=number3)
        {
            System.out.println(number1+ " is the smallest");
        }
        else if(number2<=number1&&number2<=number3)
        {
            System.out.println(number2 + " is the smallest");
        }
        else
        {
            System.out.println(number3+ " is the smallest");
        }
    }
}