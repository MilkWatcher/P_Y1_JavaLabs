class Jlab_46
/*]
Student Name: Reanielle Broa
Student ID: C00296913
6) Modify the program produced in (1) so that it writes out the user's input with the names reversed (Joe Doe is output as Doe Joe).
 */
{
    public static void main(String Arg[]) 
    {
        String fullName;
        String surName;
        String firstName;
        String reverseSur=" ";
        String reverseFirst=" ";
        int spacePos;
        int index;

        System.out.print("Enter your full name...");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(" ");
        firstName=fullName.substring(0, spacePos);
        surName=fullName.substring(spacePos+1);

        for(index=firstName.length()-1;index >= 0;index--)
            {
                reverseFirst += firstName.charAt(index);
            }
        for (index=surName.length()-1;index >= 0;index--)//
        {
            reverseSur += surName.charAt(index);
            
        }

        System.out.print(fullName+" is output as "+reverseFirst+reverseSur);
    }
}