class Jlab_22
/*
Student Name : 		Reanielle Patrick Broas
Student Id Number : 	C00296913

Write a program where the user enters 3 exam marks. Programming, Maths and 
Hardware. The program will then calculate their average mark and indicate 
whether the average mark is a :

		Distinction	70 - 100
		Merit1		63 - 69
		Merit2		55 - 62
		Pass		40 - 54
		Fail		Less Than 40


*/
{
	
    public static void main(String[] args)
    {
    	int programming;
    	int mathematics;
    	int hardware;
    	int totalMarks;
    	
    	System.out.print("Enter the mark you got for the subject [PROGRAMMING]... ");
		programming=EasyIn.getInt();
		System.out.print("Enter the mark you got for the subject [MATHS]... ");
		mathematics=EasyIn.getInt();
		System.out.print("Enter the mark you got for the subject [HARDWARE]... ");
		hardware=EasyIn.getInt();
		
		totalMarks=(programming+mathematics+hardware)/3;
		
		if((totalMarks>=70)&&(totalMarks<=100))
			{
				System.out.println(totalMarks+" : DISTINCTION");
			}
    	else if((totalMarks>=63)&&(totalMarks<=69))
    		{
				System.out.println(totalMarks+" : MERIT1");
			}
		else if((totalMarks>=55)&&(totalMarks<=62))
			{
				System.out.println(totalMarks+" : MERIT2");
			}
		else if((totalMarks>=40)&&(totalMarks<=54))
			{
				System.out.println(totalMarks+" : PASS");
			}
		else
			{
				System.out.println(totalMarks+" : FAIL");
			}
    	
    }
}

