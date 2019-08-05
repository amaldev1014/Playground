import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int array[] = new int[n];
     for(int i=0;i<n;i++)
    {
      array[i] = scan.nextInt();
    }
      int max = 0;
      int count =0;
      int j = 0;
      for(int i=0;i<n-1;i++)
      {
   
       if(array[i]==1)
       {
         while(array[i]==1  )
         {
           count++;
           i++;
         }
         
       }
        if(max<count)
        {
          max = count;
        }
        
      }
      System.out.println(max);
      
    }
}