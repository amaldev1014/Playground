import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner scan = new Scanner(System.in);
       int n1 = scan.nextInt();
       int n2 = scan.nextInt();
       int n3 = scan.nextInt();
      int result = gcd(n1,n2);
      System.out.println(gcd(result,n3));
	}
  public static int gcd(int n1,int n2)
  {
    int min=0;
    if(n1>n2){min=n2;}
    else{min=n1;}
    for(int i=min;i>0;i++)
    {
      if(n1%min==0 && n2%min==0)
      {
        break;
      }
    }
    return min;
  }
}