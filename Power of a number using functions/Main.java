import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int base = scan.nextInt();
    int exponent = scan.nextInt();
    int power = power (base,exponent);
    System.out.println(power);
  }
  
  public static int power(int base, int exponent)
  {
   
    int m=base;
    for(int i=1;i<exponent;i++)
    {
      base=base*m;
    }
    return base;
  }
}