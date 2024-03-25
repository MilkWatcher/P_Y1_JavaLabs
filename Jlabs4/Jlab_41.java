class Jlab_41
/*
Student Name: Reanielle Broas
Student ID: C00296913
(1) Write and test a program which will 
prompt the user to enter their name, read in name, and write to the screen just the surname. (Where surname is interpreted as everything after the firstspace)
 */
{
    public static void main(String Args[])
    {
        String fullName;
        String surName;
        int spacePos;

        System.out.print("Enter your full name (First name + Surname)...");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(" ");
        surName=fullName.substring(spacePos+1);
        System.out.print("Greetings! Surname: "+surName);
    }
}