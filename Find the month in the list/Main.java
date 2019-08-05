import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String in[]  = reader.readLine().split(",");
      String month = reader.readLine();
      LinkedList list = new LinkedList();
      for(int i=0;i<in.length;i++)
      {
        list.add(in[i]);
      }
      System.out.println(list);
      System.out.println("Size of the linked list: "+ list.size());
      System.out.println("Is LinkedList empty? "+list.isEmpty());
      System.out.println("Does LinkedList contains "+month+"?");
      System.out.println(list.contains(month));
    }
}