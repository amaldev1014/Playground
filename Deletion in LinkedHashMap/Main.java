import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(reader.readLine());
     LinkedHashMap map = new LinkedHashMap();
      System.out.println("Enter the number of values to be inserted in map:"+n);
      while(n>=1)
      {
        
        map.put(reader.readLine(),reader.readLine());
        n--;
      }
      System.out.println(map);
      String remove = reader.readLine();
      System.out.println("Enter the index to be removed:"+remove);
      map.remove(remove);
      System.out.println(map);
      System.out.println("Size of map is : "+map.size());
    }
}