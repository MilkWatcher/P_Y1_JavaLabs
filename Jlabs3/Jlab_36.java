class Jlab_36
/*
 * Student Name: Reanielle Broas
 * STudent ID: C00296913
 * 6)	Modify the above program so that it tells the user if the highest or lowest number has been entered more than once, and if so how many times.
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
      int countHighest=0;
      int countLowest=0;

      System.out.print("How many numbers do you want to enter... ");
      numberCount=EasyIn.getInt();

      for(index=0;index<=numberCount;index++)
      {
        System.out.print("Enter a value...");
        number=EasyIn.getInt();
        total=total+number;
        averageValue=total/numberCount;

        if(index==0||numberCount>largest)
        {
            largest=number;
            countHighest=1;
        }
        else if(number==largest)
        {
            countHighest++;
        }
        if(index==0||numberCount<smallest)
        {
            smallest=number;
            countLowest=1;
         }
         else if(number==smallest)
         {
            countLowest++;
         }
         averageValue=total/(index+1);
         System.out.print("Current Average Value... "+averageValue+"");
         System.out.print("Current Largest Value... "+largest+" it has been entered... "+countHighest+"");
         System.out.print("Current Smallest Value... "+smallest+" it has been entered... "+countLowest+"");
      }
      averageValue=total/numberCount;
      System.out.print("Final Average Value... "+averageValue+"");
      System.out.print("Final Largest Value... "+largest+"");
      System.out.print("Final Smallest Value... "+smallest+"");
   }
}
