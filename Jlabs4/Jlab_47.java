class Jlab_47
/*
Student Name: Reanielle Broa
Student ID: C00296913
7) Modify the program produced in (1) so that it writes out the number of occurrences of the letter a in the user's input. 
(Treat A and a as the same character).
 */
{
    public static void main(String Arg[]) 
    {
        String fullName;
        int charCount=0;
        int index;

        System.out.print("Enter your full name... ");
        fullName=EasyIn.getString();
        for (index=0;index<fullName.length();index++) 
        {
            char ch = fullName.charAt(index);
            if (ch=='A'||ch=='a')
            {
                charCount++;
            } 
        }
        System.out.print("Greetings! "+fullName+" ");
        System.out.print("The number of times the letter [A] has been input... "+charCount);
    }
}