class Jlab_34
/*
Student Name: Reanielle Broas

4)	Write a program to find the largest, smallest and average value in a collection of N numbers. 
(Run the program numbers.exe on the Common Disk to see how it should work)
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

         if(index==1||number>largest)
         {
            largest=number;
         }
         if(index==1||number<smallest)
         {
            smallest=number;
         }
      }
      averageValue=(double) total/numberCount;
      System.out.print( "Average Value... "+averageValue+//
                        "Largest Value... "+largest+//
                        "Smallest Value... "+smallest);
    }
}