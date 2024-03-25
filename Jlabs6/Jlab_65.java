class Jlab_65
{
    public static void main(String[] args) 
    {
        int choice;

        do 
        {
            menu();
            choice = EasyIn.getInt();
            switch (choice) 
            {
                case 1:
                    fahrToCel();
                    break;
                case 2:
                    celToFahr();
                    break;
                case 3:
                    inchToCent();
                    break;
                case 4:
                    centToInch();
                    break;
                case 5:
                    poundToKg();
                    break;
                case 6:
                    kgToPound();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;
            }
        } while (choice != 7);
    }

    public static void menu() 
    {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Inches to Centimeters");
        System.out.println("4. Centimeters to Inches");
        System.out.println("5. Pounds to Kilograms");
        System.out.println("6. Kilograms to Pounds");
        System.out.println("7. Exit Program");
        System.out.print("Enter your choice: ");
    }

    public static void fahrToCel() 
    {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahr = EasyIn.getDouble();
        double cel = (fahr - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + cel);
    }

    public static void celToFahr() 
    {
        System.out.print("Enter temperature in Celsius: ");
        double cel = EasyIn.getDouble();
        double fahr = cel * 9 / 5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahr);
    }

    public static void inchToCent() 
    {
        System.out.print("Enter length in inches: ");
        double inch = EasyIn.getDouble();
        double cent = inch * 2.54;
        System.out.println("Length in centimeters: " + cent);
    }

    public static void centToInch() 
    {
        System.out.print("Enter length in centimeters: ");
        double cent = EasyIn.getDouble();
        double inch = cent / 2.54;
        System.out.println("Length in inches: " + inch);
    }

    public static void poundToKg() 
    {
        System.out.print("Enter weight in pounds: ");
        double pound = EasyIn.getDouble();
        double kg = pound * 0.453592;
        System.out.println("Weight in kilograms: " + kg);
    }

    public static void kgToPound() 
    {
        System.out.print("Enter weight in kilograms: ");
        double kg = EasyIn.getDouble();
        double pound = kg / 0.453592;
        System.out.println("Weight in pounds: " + pound);
    }
}