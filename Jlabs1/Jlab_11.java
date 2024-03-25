class Jlab_11
/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913
*/
{
	public static void main(String args[])
	{
		int inches;
		int answer;
		
		System.out.print("Input a value in inches, ");
		inches=EasyIn.getInt();
		answer=(int)(inches*2.54);
		System.out.println("Converting inches to centimeters you get... "+answer);
	}
}