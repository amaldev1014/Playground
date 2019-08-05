import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   System.out.println(fact(n));
    
  }
  public static int fact(int n)
  {
    if(n==0 || n==1)
    {
      return 1;
    }
    else
    {
      return n * fact(n-1);
    }
  }
}