class Jlab_63
{
    public static int alphaCount(String string)
    {
        int charCount=0;
        for(int index=0; index<string.length();index++)
        {
            char character = string.charAt(index);
            if(Character.isLetterOrDigit(character))
            {
                charCount++;
            }
        }
        return charCount;
    }
    public static void main (String args[])
    {
        System.out.println("Enter a string...");
        String inputString=EasyIn.getString();
        int result = alphaCount(inputString);
        System.out.println("Number of alphabetic characters and numbers in the string... "+result);
    }
}