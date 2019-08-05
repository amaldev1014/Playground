import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String in[] = reader.readLine().split(",");
      System.out.println("Duplicate Entry is:");
      	Set set = new TreeSet();
      for(int i=0;i<in.length;i++){
      if(set.contains(in[i]))
      {
        System.out.println(in[i]);
         
      }
       set.add(in[i]);
      }
      System.out.println("TreeSet is : "+set);
    }
}