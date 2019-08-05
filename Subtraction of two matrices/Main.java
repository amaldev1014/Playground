import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
   Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int col = scan.nextInt();
    int mat1[][] = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        mat1[i][j] = scan.nextInt();
      }
    }
    
    int mat2[][] = new int[row][col];
    for(int k=0;k<row;k++)
    {
      for(int l=0;l<col;l++)
      {
        mat2[k][l] = scan.nextInt();
      }
    }
    
     int sub[][] = new int[row][col];
    for(int t=0;t<row;t++)
    {
      for(int h=0;h<col;h++)
      {
        sub[t][h] = mat1[t][h]-mat2[t][h];
      }
    }
  
   for(int a=0;a<row;a++)
    {
      for(int s=0;s<col;s++)
      {
      System.out.print(sub[a][s]+" ");
      }
     System.out.println();
    }
    
    
  }
}