import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      System.out.println("Enter the number of values to be inserted in map:"+n);
      Map map = new TreeMap();
      while(n>=1)
      {
        map.put(scan.next(),scan.next());
        n--;
      }
      System.out.println(map);
      String s = scan.next();
      System.out.println("Enter the index to be removed:"+s);
      map.remove(s);
       System.out.println(map);
      String insert= scan.next();
      System.out.println("Enter the index to insert:"+insert);
      String value = scan.next();
      System.out.println("Enter the value to be inserted:"+value);
      map.put(insert,value);
      System.out.println(map);
    }
}