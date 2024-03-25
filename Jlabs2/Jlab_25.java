class Jlab_25
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
        int number3;
    	
        System.out.print("Goal! Enter two numbers that can be divisible by each other... ");
    	System.out.print("Enter your first number... ");
		number1=EasyIn.getInt();
		System.out.print("Enter your first divisible... ");
		number2=EasyIn.getInt();
        System.out.print("Enter your second divisible... ");
		number3=EasyIn.getInt();

		if ((number1%number2==0)&&(number1%number3==0));
        {
            System.out.println("Yipee! Both numbers " +number2+ " and " +number3+ " are divisibles of" +number1+ "!");
        } 
        if(number1%number2==0);
        {
            System.out.println("Ding ding! " +number1+ " can be divided into " +number3+ " :D");
        }
        if(number1%number3==0)
        {
            System.out.println("Ding ding! " +number1+ " can be divided into " +number3+ " :D");
        }
        else
        {
            System.out.println("Both numbers are not divisible by the first number...");
        }
    }
}

