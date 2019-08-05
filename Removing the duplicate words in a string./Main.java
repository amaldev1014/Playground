import java.util.Scanner;
import java.util.Arrays;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    String string = scan.nextLine();
    String arr[] = string.split(" ");
   
    StringBuilder builder = new StringBuilder("");
    builder.append(arr[0]+" ");
    boolean is_repeated=false;
    
    for(int i=1;i<arr.length;i++)
    {
      is_repeated=false;
      for(int j=0;j<i;j++){
  
      if(arr[i].equals(arr[j]))
      {
        is_repeated = true;
      }
        
      }
      if(!is_repeated )
        {
          builder.append(arr[i]+" ");
      
        }
      
     
    }
    
     System.out.println(builder);
  }
}