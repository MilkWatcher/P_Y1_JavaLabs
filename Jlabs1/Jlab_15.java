/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Enter a loan amount, the interest rate per annum and the amount
of years the loan is to be taken out for. The program should 
then calculate and print out the total amount repaid.

1. Output message to user in regards to loan amount
2. User inputs loan amount
3. Output message to user in regarsd to rate per annum
4. User inputs rate per annum
5. Output message to user in regards to the maount of years 
6. User inputs years
7. System outputs the total amount repaid

(Loan amount*Interestrate)*Years
*/

class Jlab_15
{
	public static void main(String args[])
	{
		int loanAmount;
		int interestRate;
		int totalYears;
		int answer;
		
		System.out.print("Enter a loan amount ");
		loanAmount=EasyIn.getInt();
		System.out.print("Enter the interest rate per annum ");
		interestRate=EasyIn.getInt();
		System.out.print("Enter the amount of years the loan is to be taken out for ");
		totalYears=EasyIn.getInt();
		
		answer=loanAmount*interestRate*totalYears;
		
		System.out.println("The total amount repaid is..." + answer);
	}
}