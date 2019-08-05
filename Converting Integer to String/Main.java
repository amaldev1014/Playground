import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    StringBuilder builder = new StringBuilder("");
    char ch;
    if(n>=0){
    while(n>0)
    {
      int rem =n%10;
      n=n/10;
      ch = (char) (48 + rem);
      builder.append(ch);
    }
    }
    else
    {
     
      n=n*-1;
      while(n>0){
       int rem =n%10;
      n=n/10;
      ch = (char) (48 + rem);
      builder.append(ch);
      }
       builder.append('-');
      
    }
    System.out.println(builder.reverse());
  }
}