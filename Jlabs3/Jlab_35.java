class Jlab_35
/*
Student Name: Reanielle Broas

5)	Modify the above program so that it shows the current highest, 
current lowest and current average after each successive number is entered.
 */
{
    public static void main(String Args[])
    {
      int index;
      int number;
      int numberCount;

      int largest=0;
      int smallest=0;
      int total=0;
      double averageValue;

      System.out.print("How many numbers do you want to enter...");
      numberCount=EasyIn.getInt();

      for(index=1;index<=numberCount;index++)
      {
         System.out.print("Enter a value...");
         number=EasyIn.getInt();
         total=total+number;
         averageValue=total/numberCount;

         if(index==1||numberCount>=largest)
         {
            largest=number;
         }
         if(index==1||numberCount<=smallest)
         {
            smallest=number;
         }
         averageValue=total/(index+1);
         System.out.print("Current Average Value... "+averageValue);
         System.out.print("Current Largest Value... "+largest);
         System.out.print("Current Smallest Value... "+smallest);
      }
      averageValue=total/numberCount;
      System.out.print("Final Average Value... "+averageValue);
      System.out.print("Final Largest Value... "+largest);
      System.out.print("Final Smallest Value... "+smallest);
   }
}