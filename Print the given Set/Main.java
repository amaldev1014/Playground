import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String in[]  = reader.readLine().split(",");
      LinkedHashSet set = new LinkedHashSet();
      for(int i=0;i<in.length;i++)
      {
        set.add(in[i]);
      }
      System.out.println(set);
    }}