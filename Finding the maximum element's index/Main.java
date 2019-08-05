import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner scan = new Scanner(System.in);
    int n =  scan.nextInt();
    int array[] = new int[n];
    for(int i=0;i<n;i++)
    {
      array[i] = scan.nextInt();
    }
    int index=0;
    int max = array[0];
    for(int j=0;j<n;j++)
    {
      if(array[j]>max)
      {
        max=array[j];
        index=j;
      }
    }
    System.out.println(index);
  }
}