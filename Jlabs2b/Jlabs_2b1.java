class Jlabs_2b1
/*
Student Name: Reanielle Patrick Broas
Student ID: C00296913
 */
{
    public static void main(String args[])
    {
        int premium;
        int totalClaims;
        double discountClaims=0.4;
        double basicPremium=0.05;
        double chargeClaims=0.2;
        double answer;

        System.out.print("Enter the valye of last years premium...");
        premium=EasyIn.getInt();
        System.out.print("Enter the number of claims made this year (if none, type 0)");
        totalClaims=EasyIn.getInt();
        if(totalClaims==0)
        {
            answer=(((premium*basicPremium)+premium)-((premium*basicPremium+premium)*discountClaims));
            System.out.print("The insurance premium of the coming year is... "+answer);
        }
        else
        {
            answer=(((premium*basicPremium)+premium)*totalClaims*chargeClaims);
            System.out.print("The insurance premium of the coming year is... "+answer);
        }
    }
}