class Jlab_69
{
    public static void main(String args[])
    {
        System.out.print("Enter your full name (First name + Surname)...");
        String inputName = EasyIn.getString();

        int secondLastSpaceIndex = secondLastSpace(inputName);
        System.out.println("Index position of the second last space: " + secondLastSpaceIndex);
    }

    public static int secondLastSpace(String inputString)
    {
        int count = 0;
        for (int i = inputString.length() - 1; i >= 0; i--) {
            if (inputString.charAt(i) == ' ') {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1; // If there are less than two spaces in the string
    }
}