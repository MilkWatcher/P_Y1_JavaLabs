class Jlab_61
{
    public static boolean isEven(int input)
    {
        return input % 2 == 0;
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter an integer...");
        int input=EasyIn.getInt();
        
        System.out.println("Is the number even? "+isEven(input));
    }
}
