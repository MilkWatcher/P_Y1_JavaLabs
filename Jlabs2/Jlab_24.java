class Jlabs_24
/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Write a program which ask the user for 2 numbers, it then indicates whether 
the first number is exactly divisible by the second number.

1.  Output message asking user for 2 numbers
2.  User inputs the 2 numbers
3.  Systems check if both numbers can be divisivble by each other
4.  Output message if its TRUE or FALSE
*/
{
	
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	
        System.out.print("Goal! Enter two numbers that can be divisible by each other... ");
    	System.out.print("Enter your first number... ");
		number1=EasyIn.getInt();
		System.out.print("Enter your second number... ");
		number2=EasyIn.getInt();


		if (number1%number2==0)
        {
            System.out.println("Yipee!" +number2+ " can be divided into "+number1);
        } 
        else
        {
            System.out.println(number2+" can not be divided into "+number1);
        }
    }
}

