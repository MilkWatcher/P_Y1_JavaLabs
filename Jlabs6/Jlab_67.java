class Jlab_67
{
    public static void main(String args[])
    {
        System.out.print("Enter your full name (First name + Surname)...");
        String inputName = EasyIn.getString();

        int lastSpaceIndex = myLastSpace(inputName);
        System.out.println("Index position of the last space: " + lastSpaceIndex);
    }

    public static int myLastSpace(String inputString)
    {
        int lastIndex = -1;
        for (int i = 0; i < inputString.length(); i++) 
        {
            if (inputString.charAt(i) == ' ') 
            {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}