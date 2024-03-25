class Jlabs_2b2
/*
Student Name: Reanielle Patrick Broas
Student ID: C00296913
 */
{
    public static void main(String arg[])
    {
        int creditAmount;
        double creditRemainder;
        double interestCharge=0.12;
        double interestCharge2=0.18;
        double answer; 

        System.out.print("Insert credit amount... ");
        creditAmount=EasyIn.getInt();
        
        if(creditAmount>=500)
        {
            creditRemainder=creditAmount*interestCharge;
            
            if(creditRemainder>=600)
            {
                answer=creditRemainder*interestCharge2;
                System.out.print("Calculating total credit card interest... your total is... "+answer);
            }
            else
            {
                System.out.print("Calculating total credit card interest... your total is... "+creditRemainder);
            }
        }
    }
}