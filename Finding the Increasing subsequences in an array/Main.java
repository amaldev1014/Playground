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
    
    for(int j=0;j<n-1;j++)
    {
      for(int k= j+1; k<n;k++)
      {
        if(array[j]<array[k])
        {
          System.out.println(array[j]+","+ array[k]);
        }
      }
    }
  }
}