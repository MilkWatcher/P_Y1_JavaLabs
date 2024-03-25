/*
Student Name : 	Reanielle Patrick Broas
Student Id Number : 	C00296913

Enter three numbers, and display, their sum, product and the average of the three.
1. Input 3 numbers
2. numberSum=(add all)
3. Product=(multiply all)
4. Average=(total/3)
*/

class SumProductAverage
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
		System.out.print("Input in your 2nd number => ");
		number2=EasyIn.getInt();
		System.out.print("Input in your 3rd number => ");
		number3=EasyIn.getInt();
		
		numberSum=number1+number2+number3;
		product=number1*number2*number3;
		average=numberSum/3;
		
		System.out.println("The total SUM of the 3 numbers: " + numberSum);
		System.out.println("The total PRODUCT of the 3 numbers: " + product);
		System.out.println("The total AVERAGE of the 3 numbers: " + average);
	}
	
}