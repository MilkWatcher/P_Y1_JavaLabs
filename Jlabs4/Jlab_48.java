class Jlab_48
/*
Student Name: Reanielle Broa
Student ID: C00296913
8) Modify the program produced in (1) so that it writes out the user's input with any middle 
name removed (Joe Handsome Doe becomes Joe Doe)
 */
{
    public static void main(String Arg[])
    {
        String fullName;
        String firstName=" ";
        String surName=" ";
        String modName=" ";
        int spacePos;

        System.out.print("Enter your full name (First + Middle + Surname)... ");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(" ");
        if(spacePos!=-1)
        {
            firstName=fullName.substring(0, spacePos);
            surName=fullName.substring(spacePos+1);
            modName=firstName+" "+surName;
        }
        System.out.print(fullName+" now becomes "+modName);
    }
}
