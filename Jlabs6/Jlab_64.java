class Jlab_64
{
    public static void main(String args[])
    {
        System.out.println("Enter the mark: ");
        int mark = EasyIn.getInt();
        String result = award(mark);
        System.out.println("Result: "+result);
    }

        
    public static String award(int mark)
    {
        if (mark>=70 && mark <=100)
        {
            return "DISTINCTION";
        }
        else if (mark>=63 && mark <=69)
        {
            return "Merit1";
        }
        else if (mark>=55&&mark<=62)
        {
            return "Merit2";
        }
        else if(mark>=40&&mark<=54)
        {
            return "Pass";
        }
        else
        {
            return "Fail";
        }
    }
}