class Jlab_68
{
    public static void main(String args[])
    {
        System.out.print("Enter your full name (First name + Surname)...");
        String inputName = EasyIn.getString();

        int startFrom = inputName.length() - 1; // Start looking from the end of the string
        int lastSpaceIndex = myLastSpace(inputName, startFrom);
        System.out.println("Index position of the last space: " + lastSpaceIndex);
    }

    public static int myLastSpace(String inputString, int startPos)
    {
        for (int i = startPos; i >= 0; i--) 
        {
            if (inputString.charAt(i) == ' ') 
            {
                return i;
            }
        }
        return -1; // If no space is found
    }
}