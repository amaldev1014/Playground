import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int array[] = new int[n];
    for(int i=0;i<n;i++)
    {
      array[i] = scan.nextInt();
    }
    int run = array[0];
    int max = array[0]; 
    for(int i=1;i<n;i++)
    {
      if(array[i]>array[i-1])
      {
        run = run + array[i];
      }
      else
      {
        run = array[i];
      }
      if(run>max)
      {
        max = run;
      }
    }
    System.out.println(max);
    
    
  }
}