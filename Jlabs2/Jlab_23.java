class Jlab_23
/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913
*/
{
    public static void main(String args[])
    {
        int number1;

        System.out.print("Enter a number... ");
        number1=EasyIn.getInt();

        if(number1%2==0)
        {
            System.out.print(number1+" is an even number");
        }
        else
        {
            System.out.print(number1+" is an odd number");
        }
    }
}