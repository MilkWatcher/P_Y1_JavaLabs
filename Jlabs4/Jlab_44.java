
class Jlab_44
/*
Student Name: Reanielle Broa
Student ID: C00296913
4. Modify the program produced in (1) so that it writes out the number of uppercase characters in the users input.
 */
{
    public static void main(String Arg[])
    {
        String fullName;
        int countUpChar;
        int index;

        System.out.print("Enter your full name... ");
        fullName=EasyIn.getString();

        countUpChar=0;
        for (index = 0;index<fullName.length();index++) 
        {
            char ch = fullName.charAt(index);
            if ('A'>=ch||ch<='Z') 
            {
                countUpChar++;
            }
        }
        System.out.print("Greetings! " + fullName);
        System.out.println("Number of uppercase characters in your name... " +countUpChar);
    }
}
