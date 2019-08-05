import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String in[]  = reader.readLine().split(",");
      TreeSet set = new TreeSet();
      for(int i=0;i<in.length;i++)
      {
        set.add(in[i]);
      }
      System.out.println(set);
     for(int i=0;i<set.size()+3;i++)
     {
       set.remove(set.last());
       System.out.println(set);
           
       
     }
      
    }
}