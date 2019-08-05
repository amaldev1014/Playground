import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    boolean is=false;
   Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int n=str.length();
    float out=0;
    for(int i=0;i<n;i++)
    {
      char ch = str.charAt(i);
      if(ch=='.')
      {
     is=true;
        
      }
      else{
      
      int val = ch-48;
      out = out*10+val;
      }
    }
    if(is){
     out = out/100;
    }
    System.out.println(out);
  }
}