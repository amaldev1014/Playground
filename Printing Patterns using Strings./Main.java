import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner scan = new Scanner(System.in);
    String string = scan.next();
    int len = string.length();
    int start = (len/2);
    int tee = start; 
    int count = len-1;
   while(tee<len)
   {
     for(int i=0;i<count;i++)
     {
       System.out.print(" ");
     }
     count--;
     for(int i=start;i<=tee;i++){
     System.out.print(string.charAt(i));
     }
     System.out.println();
     tee++;
   }
    StringBuilder builder = new StringBuilder(string);
    String me=builder.substring(start,len);
    String ge="";
    ge =ge+me;
    for(int i=0;i<start;i++)
    {
      for(int j=0;j<count;j++)
      {
        System.out.print(" ");
      }
      count--;
     ge=ge+string.charAt(i);
      
      System.out.println(ge);
      
      
    }
    
      
    
  }
}





