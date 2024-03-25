public class Jlab_66 
{
    public static void main(String args[])
    {
        System.out.print("Enter your full name (First name + Surname)...");
        String inputName=EasyIn.getString();

        System.out.println("Greetings! Surname: "+surNameMethod(inputName)+//
        "First Name: " + firstNameMethod(inputName)+//
        "Number of characters: " + numberCharacters(inputName)+//
        "Number of uppercase characters: " + numberUpperCaps(inputName)+//
        "Reversed input: " + flippedMethod(inputName)+//
        "Names reversed: " + outputRevMethod(inputName)+//
        "Input with middle name removed: " + middleRemoved(inputName));
    }
    public static String surNameMethod(String inputName)
    {
        int spacePos=inputName.indexOf(" ");
        String surName=inputName.substring(spacePos+1);

        return surName;
    }

    public static String firstNameMethod(String inputName)
    {
        String firstName = inputName.substring(0, inputName.indexOf(" "));
        return firstName;
    }

    public static int numberCharacters(String inputName)
    {
        int numCharacters = inputName.length();
        return numCharacters;
    }

    public static int numberUpperCaps(String inputName)
    {
    int numUppercase = 0;
        for (int i = 0; i < inputName.length(); i++) 
        {
            if (Character.isUpperCase(inputName.charAt(i))) 
            {
                numUppercase++;
            }
        }
        return numUppercase;
    }

    public static String flippedMethod(String inputName)
    {
        String flipName =" ";
        for (int i=inputName.length()-1;i >= 0;i--)//
        {
            flipName += inputName.charAt(i);
        }
        return flipName;
    }

    public static String outputRevMethod(String inputName)
    {
        String[] names = inputName.split(" ");
        String reversedNames = names[names.length - 1];

        for (int i = names.length - 2; i >= 0; i--) 
        {
            reversedNames += " " + names[i];
        }
        return reversedNames;
    }

    public static String middleRemoved(String inputName)
    {
        String[] names = inputName.split(" ");
        String result = names[0] + " " + names[names.length - 1];

        return result;
    }
}
