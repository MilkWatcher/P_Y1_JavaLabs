class Jlab_42
/*
Student Name: Reanielle Broas
Student ID: C00296913
2. Modify the program produced at {1} so that it writes out the first name (everything up to the first space) instead of the surname...
 */
{
    public static void main(String Args[])
    {
        String fullName;
        String firstName;
        int spacePos;

        System.out.print("Enter your full name...");
        fullName=EasyIn.getString();
        spacePos=fullName.indexOf(" ");
        firstName=fullName.substring(0, spacePos);
        System.out.print("Greetings! " + firstName);
    }
}