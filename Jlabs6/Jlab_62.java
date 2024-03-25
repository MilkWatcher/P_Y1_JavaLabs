class Jlab_62
{
    public static void main(String[] args)
    {
        System.out.println("Enter a character...");
        char ch = EasyIn.getChar();

        System.out.println(isAlpha(ch));
    }

    public static boolean isAlpha(char ch)
    {
        return((ch>='A'&&ch>='a')||(ch<='Z'&&ch<='z'));
    }
}