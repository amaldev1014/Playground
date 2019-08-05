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
    
    int k=0;
     int m=0;
    int t=0;
    while(t<row){
      k=0;
      m=t;
    while(k<row && m<col){
        System.out.print(arr[k][m]+" ");
        k++;
      m++;
    }
      t++;
    }
      
    
    
    
  }
}