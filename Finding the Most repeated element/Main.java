import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int array[] = new int[n];
    int barray[] = new int[11];
     for(int i=0;i<n;i++)
    {
      array[i] = scan.nextInt();
    }
    
    
    for(int j=0;j<n;j++)
    {
      barray[array[j]]++;
    }
    int max = 0;
    for(int i=1;i<11;i++)
    {
      if(barray[i]>max)
      {
        max = i;
      }
    }
    System.out.println(max);
  }
}