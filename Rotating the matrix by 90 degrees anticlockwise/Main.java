import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int col = scan.nextInt();
    int arr[][] = new int[row][col];
    
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j] = scan.nextInt();
      }
    }
    
    for(int k=row-1;k>=0;k--)
    {
      for(int l=0;l<col;l++)
      {
        System.out.print(arr[l][k]+" ");
      }
      System.out.println();
    }
    
  }
}