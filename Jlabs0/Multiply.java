class Multiply

/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913
Some program to multiply three numbers entered from a keyboard
*/

{
		public static void main(String args[])
		{
			int number1;
			int number2;
			int number3;
			int answer;
			
			System.out.print("Enter the first number -->");
			number1=EasyIn.getInt();
			System.out.print("Enter the second number -->");
			number2=EasyIn.getInt();
			System.out.print("Enter the third number -->");
			number3=EasyIn.getInt();
			answer=(number1)*(number2)*(number3);
			System.out.println("Multiplying these 3 numbers, we get "+answer);
			}
			
}