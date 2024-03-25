class Jlab_02
/*

Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Write pseudocode/algorithm and then a program which computes a 
taxpayer's tax payment for a year, given as input the taxpayer's 
annual income and number of children.  It is assumed that tax 
is calculated at 24% of income less tax allowances, where the allowances consist of a 
personal allowance of �5,000 plus a child allowance of �1,000 per child.

1. Output message asking user for their annual income
2. User inputs annual income
3. Output message asking user for the number of child they have
4. User inputs no. of children
5. Calculate the total allowance (no. children* 1000 child allowance) and the 5,000 personal allowance
6. Calcualte the total amount of tax owed by doing (allowance - annualincome by 24%)
*/

{
	public static void main(String args[])
	{
		int number1;
		int number2;
		int allowance;
		int answer;
		
		System.out.print("Enter your Annual Income ");
		number1=EasyIn.getInt();
		System.out.print("Enter the number of children you have ");
		number2=EasyIn.getInt();
		
		allowance=(int)(number2*1000+5000);
		answer=(int)(allowance-number1*0.24);
		System.out.println("The total amount of tax you owe is... "+answer);
	}
}