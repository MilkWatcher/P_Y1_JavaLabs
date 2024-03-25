class Jlab_01
/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913
*/
{
	public static void main(String args[])
	{
		int number1;
		int answer;
		
		System.out.print("Farenheit? ");
		number1=EasyIn.getInt();
		answer=(number1-32)*5/9;
		System.out.println("Converting Farenheint to Centigrade we get "+answer+" degrees centigrade!");
	}
}
