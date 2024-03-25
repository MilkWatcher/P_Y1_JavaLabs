class Jlab_45
/*
Student Name: Reanielle Broa
Student ID: C00296913
5) Modify the program produced in (1) so that it writes out the user's input reversed (Joe Doe is output as eoD eoJ).
 */
{
    public static void main(String Arg[]) 
    {
        String fullName;
        String reverseName=" ";
        int index;

        System.out.print("Enter your full name...");
        fullName=EasyIn.getString();

//         giveindexlast character in the string
//                  v               loop condition    
//                  v                      v        decrements the value i by 1 each loop        
        for (index=fullName.length()-1;index >= 0;index--)//
        {
            reverseName += fullName.charAt(index);
        }
        System.out.print(fullName+" is output as "+reverseName);
    }
}
