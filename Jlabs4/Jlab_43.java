class Jlab_43
/*
3. Modify the program in {1} so that it writes out the number of characters in the users input...
 */
{
    public static void main(String Args[])
    {
        String fullName;
        int countChar;
        int spacePos=0;

        System.out.print("Enter your full name...");
        fullName=EasyIn.getString();
        countChar=fullName.length();

        fullName=fullName.substring(0, spacePos);
        System.out.print("Greetings! " + fullName);
        System.out.print("You have... "+countChar+" in your name");
    }
}