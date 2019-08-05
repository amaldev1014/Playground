import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       for(int i=2;i<=n;i++)
       {
         boolean is = primenumber(i);
         if(is)
         {
           System.out.println(i);
         }
       }
	}
  public static boolean primenumber(int i)
  {
    int count=0;
    for(int j=2;j<=i;j++)
    {
      if(i%j==0)
      {
        count++;
      }
    }
    if(count>1)
    {
      return false;
    }
    else
    {
      return true;
    }
  }
}