/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Modify the SumsProductAverage program so that it displays current sum, product and average after 
each number is added.
{output message tellin user to insert num1}
1. User Inputs some number or somethin
{output message tellin user to insert num2}
2. User Inputs a second number
3.System gives user the SUM AVERAGE and PRODUCT
{output message tellin user to input another num}
4. User Inputs +1 Number
5. System gives user the NEW SUM AVERAGE and PRODUCT
6. Repeats (?)
*/

class Jlab_14
{
	public static void main(String args[])
	{
		int number1;
		int number2;
		int number3;
				
		int numberSum;
		int product;
		int average;
		
		System.out.print("Input in your 1st number => ");
		number1=EasyIn.getInt();

		numberSum=number1;
		product=number1;
		average=numberSum/1;
		
		System.out.print("Input in your 2nd number => ");
		number2=EasyIn.getInt();

		numberSum=number1+number2;
		product=number1*number2;
		average=numberSum/2;
		
		System.out.println("The total SUM:" + numberSum);
		System.out.println("The total PRODUCT:" + product);
		System.out.println("The total AVERAGE:" + average);
		
		System.out.print("Input in your 3rd number => ");
		number3=EasyIn.getInt();
		numberSum=number1+number2+number3;
		product=number1*number2*number3;
		average=numberSum/3;
		
		numberSum=number1+number2+number3;
		product=number1*number2*number3;
		average=numberSum/3;
		
		System.out.println("The total SUM of the 3 numbers:" + numberSum);
		System.out.println("The total PRODUCT of the 3 numbers:" + product);
		System.out.println("The total AVERAGE of the 3 numbers:" + average);
	}
	
}