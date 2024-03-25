class Addition
/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913
*/
{
    public static void main(String args[])
    {
        int number1;
        int number2;
        int answer;

        System.out.print("Enter the first number... ");
        number1=EasyIn.getInt();
        System.out.print("Enter the second number... ");
        number2=EasyIn.getInt();

        answer=number1+number2;
        System.out.print("The sum of the two numbers is..."+answer);
    }
}