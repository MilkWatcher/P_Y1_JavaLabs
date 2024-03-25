class Jlabs_2b6
/*
Write a simple menu driven program that will present the user with the follow conversion
menu (look up conversion rates on the the internet)

1. Farenheit to Ceclius
2. Celcius to farenheit
3. Inches to centimetres
4. Centimetres to inches
5. Pounds to kilograms
6. Kilograms to Pounds
 */
{
    public static void main(String[] args)

    {
        int Celcius;
        int Farenheit;
    	int option;
        double Inches;
        double Centimetres;
        double Pounds;
        double Kilograms;
    
    	System.out.println(""+//
                "Select conversion program:\n"+//
                "1. Farenheit to Ceclius\n" + //
    	        "2. Celcius to farenheit\n" + //
    	        "3. Inches to centimetres\n" + //
    	        "4. Centimetres to inches\n" + //
    	        "5. Pounds to kilograms\n" + //
    	        "6. Kilograms to Pounds");
                
        option=EasyIn.getInt();
        switch(option)
        {
            case 1:

            {
                System.out.println("You selected Farenheit to Celcius\n"+//
                "Insert Farenheit value... \n");
                Farenheit=EasyIn.getInt();
                Celcius=(Farenheit-32)*5/9;
                System.out.println(Farenheit+" is equivalent to "+Celcius);
            }
            break;
            case 2:
            {
                System.out.println("You selected Celcius to Farenheit\n"+//
                "Insert Celcius value... \n");
                Celcius=EasyIn.getInt();
                Farenheit=(Celcius*9/5)+32;
                System.out.println(Celcius+" is equivalent to "+Farenheit);
            }
            break;
            case 3:
            {
                System.out.println("You selected Inches to centimetres\n"+//
                "Insert a value in inches... \n");
                Inches=EasyIn.getInt();
                Centimetres=Inches*2.54;
                System.out.println(Inches+" is equivalent to "+Centimetres);
            }
            break;
            case 4:
            {   
                System.out.println("You selected Centimetres to Inches\n"+//
                "Insert a value in centimetres... \n");
                Centimetres=EasyIn.getInt();
                Inches=Centimetres/2.54;
                System.out.println(Centimetres+" is equivalent to "+Inches);
            }
            break;
            case 5:
            {
                System.out.println("You selected Pounds to Kilograms\n"+//
                "Insert a value in Pounds... \n");
                Pounds=EasyIn.getInt();
                Kilograms=Pounds/2.54;
                System.out.println(Pounds+" is equivalent to "+Kilograms);
            }
            break;
            case 6:
            {
                System.out.println("You selected Kilograms to Poundsn"+//
                "Insert a value in Kilograms... \n");
                Kilograms=EasyIn.getInt();
                Pounds=Kilograms*2.54;
                System.out.println(Kilograms+" is equivalent to "+Pounds);
            }
            break;

default:
System.out.println("Invalid option D:");

        }
    }
}