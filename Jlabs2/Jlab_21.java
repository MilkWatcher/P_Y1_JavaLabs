class Jlab_21
/*

Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Write a program in which the user enters an integer value. 
Depending on the input the program will output whether the number 
was greater than zero, less than zero or equal to zero.

1. Output message (integer value)
2. User inputs integer value
3. System identifies if the number is greater than zero
4. System identifies if the number is less than zero
5. System identifies if the number is equal to zero
*/ 
{
	public static void main(String args[])
	{
	
		int number1;
		
		System.out.print("Enter a number ");
		number1=EasyIn.getInt();
		
		if(number1>0)
		{
		System.out.println(number1+" is greater to 0");
		}
  	  	else
		{
		System.out.println(number1+" is less to 0");	 
		} 
		if(number1==0)
		{
		System.out.println(number1+" is equal to 0");
		}
	}
}
