import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      List list = new ArrayList();
      int key =Integer.parseInt(reader.readLine());
       System.out.println("Choose any one:");
      System.out.println("1.Insert");
      System.out.println("2.delete");
      System.out.println("3.Display");
      System.out.println("4.Exit");
     while(key != 4){
     
       if(key ==1)
       {
         String initial[] = reader.readLine().split(",");
         for(int i=0;i<initial.length;i++)
         {
           list.add(initial[i]);
         }
       }
       if(key ==2)
       {
         int value = Integer.parseInt(reader.readLine());
         System.out.println("Enter the index value to be deleted:"+value);
         list.remove(value);
       }
       if(key == 3)
       {
        System.out.println(list); 
       }
       key = Integer.parseInt(reader.readLine());
       
        System.out.println("Choose any one:");
      System.out.println("1.Insert");
      System.out.println("2.delete");
      System.out.println("3.Display");
      System.out.println("4.Exit");
     }
       
      
      
    }
}