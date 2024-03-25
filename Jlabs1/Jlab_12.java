/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Enter the following values : distance travelled in miles, 
the amount of time spent on the trip in hours and the amount 
of gallons of petrol used. The program should then display , 
the average miles per hour and the miles per gallon.

1. Input Miles, Time and Gallons of petrol use
2. Average miles per hour(total distance/total time)
3. Milers per gallon (total distance/total gallons)
*/

class Jlab_12
{
	public static void main(String args[])
	{
		int Miles;
		int Time;
		int Petrol;
		int AverageMiles;
		int MilesGallon;
		
		System.out.print("In miles, how far have you travelled?  ");
		Miles=EasyIn.getInt();
		System.out.print("How long (in hours) did you travel? ");
		Time=EasyIn.getInt();
		System.out.print("How many gallons of petrol did you use? ");
		Petrol=EasyIn.getInt();
		
		AverageMiles=Miles/Time; // code to calculate average miles
		MilesGallon=Miles/Petrol; // code to calculate miles per gallon
		
		System.out.println("Average miles per hour:" + AverageMiles);
		System.out.println("Miles per gallon used:" + MilesGallon);
	}
}
